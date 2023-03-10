package com.kylix.model

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
	@field:SerializedName("status")
	val status: String = "",
	@field:SerializedName("message")
	val message: String = "",
	@field:SerializedName("data")
	val data: T?
	
)
