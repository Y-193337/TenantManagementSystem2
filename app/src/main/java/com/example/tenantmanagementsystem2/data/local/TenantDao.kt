package com.example.tenantmanagementsystem2.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tenantmanagementsystem2.data.model.Tenant

@Dao
interface TenantDao {

    @Query("SELECT * FROM tenants ORDER BY name ASC")
    fun getAllTenants(): LiveData<List<Tenant>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTenant(tenant: Tenant)
}