package com.mybank.controller

import com.mybank.model.AccountHolder
import com.mybank.service.AccountHolderService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/accountholders")
class AccountHolderController(private val accountHolderService: AccountHolderService) {

    @Post
    fun addAccountHolder(accountHolder: AccountHolder): AccountHolder {
        return accountHolderService.addAccountHolder(accountHolder)
    }
}