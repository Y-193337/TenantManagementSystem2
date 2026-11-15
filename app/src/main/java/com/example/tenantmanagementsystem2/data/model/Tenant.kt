package com.example.tenantmanagementsystem2.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "tenants")
data class Tenant(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {

    constructor(name: String, phone: String, rent: String) : this(0, name, phone, rent)

    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}