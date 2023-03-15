package com.example.sweef_test_mikheil_tsitsishvili

import java.util.*


class HashTable<K, V>( val capacity: Int) {

    private val table = Array<LinkedList<Pair<K, V>>>(capacity) { LinkedList() }

    private fun hash(key: K): Int {
        return key.hashCode() % capacity
    }

    private var _size = 0

    val size: Int
        get() = _size

    fun put(key: K, value: V) {
        val index = hash(key)
        val list = table[index]
        for (i in 0 until list.size) {
            val pair = list[i]
            if (pair.first == key) {
                list[i] = Pair(key, value)
                return
            }
        }
        list.add(Pair(key, value))
        _size++
    }

    fun get(key: K): V? {
        val index = hash(key)
        val list = table[index]
        for (pair in list) {
            if (pair.first == key) {
                return pair.second
            }
        }
        return null
    }


    fun remove(key: K) {
        val index = hash(key)
        val list = table[index]
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            val pair = iterator.next()
            if (pair.first == key) {
                iterator.remove()
                _size--
                return
            }
        }
    }
}

val hashTable = HashTable<String,Long>(20)
fun main(){
    hashTable.put("misho",551585021)
    hashTable.put("aly",551585022)
    hashTable.put("toko",551585023)
    hashTable.put("oto",551585024)

    println(hashTable.get("aly"))
    hashTable.remove("toko")
    println(hashTable.size)
}
