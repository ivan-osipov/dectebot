package com.github.ivan_osipov.clabo.api.internal

import com.github.ivan_osipov.clabo.api.model.Message
import com.github.ivan_osipov.clabo.api.output.dto.OutputParams

interface OutgoingInteractionApi {

    fun sendMessageSync(outputParams: OutputParams) : Message

    fun sendMessageAsync(outputParams: OutputParams, successCallback: (Message) -> Unit = {})

}