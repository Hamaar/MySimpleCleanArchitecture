package com.hamaar.mysimplecleanarchitecture.data

import com.hamaar.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository (private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)

}