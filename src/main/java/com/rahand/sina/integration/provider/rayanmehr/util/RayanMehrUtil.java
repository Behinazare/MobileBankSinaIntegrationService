package com.rahand.sina.integration.provider.rayanmehr.util;

import com.rahand.sina.integration.domain.echarge.dto.InternetPackage;
import com.rahand.sina.integration.domain.echarge.enums.EchargeOperator;
import com.rahand.sina.integration.domain.echarge.enums.EchargeType;
import com.rahand.sina.integration.provider.rayanmehr.proxy.BaseProductV7;
import com.rahand.sina.integration.provider.rayanmehr.proxy.BoltonV7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RayanMehrUtil {

    public static List<InternetPackage> mapToInternetPackageList(List<BoltonV7> boltonList, EchargeType echargeType, EchargeOperator echargeOperator) {

        List<InternetPackage> internetPackages = new ArrayList<>();

        Integer operator = mapToRayanMehrOperator(echargeOperator);
        Integer chargeType = mapToRayanMehrChargeType(echargeOperator, echargeType);

        List<BoltonV7> filteredBoltonList = boltonList.stream().filter(x -> x.getIsActive() && x.getOperatorId().equals(operator)
                && x.getSymTypeId().equals(chargeType)).collect(Collectors.toList());

        filteredBoltonList = filteredBoltonList.stream()
                .sorted(Comparator.comparing(BaseProductV7::getDurationInHours)
                        .thenComparing(BaseProductV7::getPrice))
                .collect(Collectors.toList());

        InternetPackage internetPackage;

        for (int i = 0; i < filteredBoltonList.size(); i++) {

            BoltonV7 boltonV7 = filteredBoltonList.get(i);
            internetPackage = new InternetPackage();
            internetPackage.setId(String.valueOf(boltonV7.getId()));
            internetPackage.setDetail(boltonV7.getName());
            internetPackage.setDescription(boltonV7.getName());
            internetPackage.setPrice(String.valueOf(boltonV7.getPrice()));
            internetPackage.setDuration(mapToDurationCategory(boltonV7.getDurationInHours()));
            internetPackage.setDurationCat(mapToDuration(boltonV7.getDurationInHours()));
            internetPackage.setOperator(echargeOperator.getName());

            internetPackages.add(internetPackage);
        }


        return internetPackages;
    }

    private static Integer mapToRayanMehrOperator(EchargeOperator echargeOperator) {
        Integer operator = 0;
        if (echargeOperator.equals(EchargeOperator.MTNI)) {
            operator = 1;
        } else if (echargeOperator.equals(EchargeOperator.IRTC)) {
            operator = 3;
        } else if (echargeOperator.equals(EchargeOperator.RITL)) {
            operator = 4;
        }
        return operator;
    }

    private static Integer mapToRayanMehrChargeType(EchargeOperator echargeOperator, EchargeType echargeType) {

        Integer chargeType = 0;

        if (echargeOperator.equals(EchargeOperator.MTNI) && echargeType.equals(EchargeType.CREDIT)) {
            chargeType = 1;
        } else if (echargeOperator.equals(EchargeOperator.MTNI) && echargeType.equals(EchargeType.FIXED)) {
            chargeType = 2;
        } else if (echargeOperator.equals(EchargeOperator.MTNI) && echargeType.equals(EchargeType.DATA)) {
            chargeType = 3;
        } else if (echargeOperator.equals(EchargeOperator.IRTC) && echargeType.equals(EchargeType.CREDIT)) {
            chargeType = 4;
        } else if (echargeOperator.equals(EchargeOperator.IRTC) && echargeType.equals(EchargeType.FIXED)) {
            chargeType = 5;
        } else if (echargeOperator.equals(EchargeOperator.IRTC) && echargeType.equals(EchargeType.DATA)) {
            chargeType = 1001;
        } else if (echargeOperator.equals(EchargeOperator.IRTC)) {
            chargeType = 1001;
        } else if (echargeOperator.equals(EchargeOperator.RITL) && echargeType.equals(EchargeType.CREDIT)) {
            chargeType = 8;
        } else if (echargeOperator.equals(EchargeOperator.RITL) && echargeType.equals(EchargeType.FIXED)) {
            chargeType = 9;
        } else if (echargeOperator.equals(EchargeOperator.RITL) && echargeType.equals(EchargeType.DATA)) {
            chargeType = 10;
        }
        return chargeType;
    }

    private static String mapToDurationCategory(Integer durationInHours) {

        String durationCategory = "";

        if (durationInHours >= 8760) {
            durationCategory = "سالانه";
        } else if (durationInHours >= 720) {
            durationCategory = "ماهانه";
        } else if (durationInHours == 168) {
            durationCategory = "هفتگی";
        } else if (durationInHours == 24 || durationInHours < 720) {
            durationCategory = "روزانه";
        }
        return durationCategory;
    }

    private static String mapToDuration(Integer durationInHours) {

        String durationTitle = String.format("%s روز", durationInHours / 24);

        return durationTitle;
    }

    public static Long generateReferenceId() {

        return System.currentTimeMillis();
    }
}
