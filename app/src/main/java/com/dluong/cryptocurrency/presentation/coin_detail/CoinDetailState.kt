package com.dluong.cryptocurrency.presentation.coin_detail

import com.dluong.cryptocurrency.domain.model.Coin
import com.dluong.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)