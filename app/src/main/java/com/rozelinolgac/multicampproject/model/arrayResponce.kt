package com.rozelinolgac.multicampproject.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

//@Serializable
class arrayResponce:ArrayList<Article>()

//@Serializable
@Parcelize
data class Article(
    val name: String?,
    val description: String?,
    val banner: String?,
    val leader: Leader?,
    val links: Links?,
    ):Parcelable

//@Serializable
@Parcelize

data class Leader(
    val name: String?,
    val photo: String?,
):Parcelable

//@Serializable
@Parcelize
data class Links(
    val instagram: String?,
    val participation: String?,
    val twitter: String?,
    val youtuber: String?,
):Parcelable