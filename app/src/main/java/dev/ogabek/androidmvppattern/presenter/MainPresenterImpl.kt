package dev.ogabek.androidmvppattern.presenter

import dev.ogabek.androidmvppattern.model.Post

interface MainPresenterImpl {
    fun apiPostList()
    fun apiPostDelete(post: Post)
}