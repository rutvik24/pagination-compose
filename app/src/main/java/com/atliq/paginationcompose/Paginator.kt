package com.atliq.paginationcompose

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}