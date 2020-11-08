package com.mybank.service

import com.mybank.model.Account
import com.mybank.model.AccountHolder
import io.micronaut.aop.Around
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Singleton
@Around
class AccountHolderService (@PersistenceContext val entityManager: EntityManager) {
//    @Transactional @ReadOnly
//    fun findAccountHolder(email : String) : AccountHolder? {
//        return try {
//            entityManager.createQuery("SELECT ah FROM AccountHolder ah WHERE name = :name", AccountHolder::class.java)
//                    .setParameter("email", email)
//                    .singleResult
//        } catch (e : Exception) {
//            null
//        }
//    }

    @Transactional
    fun addAccountHolder(ah: AccountHolder) : AccountHolder {
        entityManager.persist(ah)
        return ah
    }
}