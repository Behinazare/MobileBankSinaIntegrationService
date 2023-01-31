package com.rahand.sina.integration.domain.bank.repository;

import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.domain.bank.dto.FavoriteCardDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CardRepository {

    public Optional<List<FavoriteCardDto>> getFavoritesCards(String userId) {

        Optional<List<FavoriteCardDto>> favoriteCardsOptional;
        List<FavoriteCardDto> favoriteCards = new ArrayList<>();

        String query = "SELECT fav_bank.EXTRA_,BA_INFO.LOGOADDRESS  FROM XTI22CARDFAVORITE fav_bank  left join  XTI22CARTBANKINFO ba_info on BA_INFO.PRECARTNUMBER = SUBSTR(FAV_BANK.VALUE_,0,6) WHERE fav_bank.USERID = ?";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {

            preparedStatement.setString(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String cardJson = resultSet.getString("EXTRA_");
                FavoriteCardDto favoriteCardDto = CommonUtil.jsonToObject(cardJson, FavoriteCardDto.class);
                favoriteCardDto.setBankIcon(resultSet.getString("LOGOADDRESS") != null ? resultSet.getString("LOGOADDRESS") : "");
                favoriteCards.add(favoriteCardDto);
            }

            favoriteCardsOptional = favoriteCards.isEmpty() ? Optional.empty() : Optional.of(favoriteCards);

        } catch (SQLException e) {
            CommonUtil.logError(getClass().getSimpleName(), "getFavoritesCards", e.toString());
            favoriteCardsOptional = Optional.empty();
        }

        return favoriteCardsOptional;

    }

}
