package com.hamaar.mysimplecleanarchitecture.data

import com.hamaar.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")

}