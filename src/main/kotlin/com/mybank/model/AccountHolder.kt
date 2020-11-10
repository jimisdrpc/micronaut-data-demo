package com.mybank.model


import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class AccountHolder(@Id
                         @GeneratedValue //(strategy = GenerationType.SEQUENCE, generator = "account_generator")
                         //@SequenceGenerator(name="account_generator", sequenceName = "account_seq")
                         var id: Long? = null,
                         var name : String? = null
                         //, var age: Int, var birthDate: LocalDateTime, var category: Category
)

