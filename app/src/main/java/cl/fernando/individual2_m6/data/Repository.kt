package cl.fernando.individual2_m6.data

import androidx.lifecycle.LiveData
import cl.fernando.individual2_m6.data.local.Item
import cl.fernando.individual2_m6.data.local.ItemDao

class Repository (private val itemDao: ItemDao){
    suspend fun insertItem(item: Item){
        itemDao.insertItem(item)
    }

    fun getItem():
            LiveData<List<Item>> {
        return itemDao.getAllItems()
    }

}