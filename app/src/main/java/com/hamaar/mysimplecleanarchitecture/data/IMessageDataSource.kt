package com.hamaar.mysimplecleanarchitecture.data

import com.hamaar.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}