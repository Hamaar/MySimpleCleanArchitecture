package com.hamaar.mysimplecleanarchitecture.di

import com.hamaar.mysimplecleanarchitecture.data.IMessageDataSource
import com.hamaar.mysimplecleanarchitecture.data.MessageDataSource
import com.hamaar.mysimplecleanarchitecture.data.MessageRepository
import com.hamaar.mysimplecleanarchitecture.domain.IMessageRepository
import com.hamaar.mysimplecleanarchitecture.domain.MessageInteractor
import com.hamaar.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}