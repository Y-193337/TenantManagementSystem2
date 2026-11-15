# Tenant Management System

An Android app for landlords to record tenants, see total rent, and call tenants.

## Download
Latest APK: see **Releases** on the right of this page.

## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer

## Architecture
- `ui/`: Activities, Fragments, and TenantViewModel (UI layer)
- `data/`: Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)

Data Flow: Screens → TenantViewModel (LiveData) → TenantRepository → Room Database

## Team
| Stage | Member | Admission No. | Pull request |
|---|---|---|---|
| 1 Lead | Member Name | 000000 | https://github.com |
| 2 ViewModel | Member Name | 000000 | https://github.com |
| 3 Room | Member Name | 000000 | https://github.com |
| 4 Screens | Member Name | 000000 | https://github.com |
| 5 Data integration | Member Name | 000000 | https://github.com |
| 6 Release | Member Name | 000000 | https://github.com |