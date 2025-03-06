package com.dluong.cryptocurrency.domain.repository

import com.dluong.cryptocurrency.data.remote.dto.CoinDetailDto
import com.dluong.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}