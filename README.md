#  Billing Software (Full Stack Project)

# Project Overview
This is a full-stack billing software application built using Spring Boot, React, and MySQL.  
It allows users to manage products, categories, customers, and generate orders with integrated online payment using Razorpay.

---

# Tech Stack
- Frontend: React (Vite)
- Backend: Spring Boot (Java)
- Database: MySQL
- Payment Gateway: Razorpay
- Authentication: JWT (JSON Web Token)

---

# Features
- User Authentication & Authorization (JWT)
- Category Management
- Item/Product Management
- User Management
- Order Creation & Billing System
- Online Payment Integration (Razorpay)
- Dashboard with daily sales & order count
- Order History & Receipt Generation

---

# Payment Integration
- Integrated Razorpay Payment Gateway
- Supports card payments (Test Mode)
- Secure order creation and payment verification

---

# Project Structure

BillingSoft_project/
│
├── billingsoftware/   (Spring Boot Backend)
├── client/            (React Frontend)

---

# How to Run the Project

# Backend (Spring Boot)
cd billingsoftware  
mvn spring-boot:run  

# Frontend (React)
cd client  
npm install  
npm run dev  

---

# Environment Variables
Update in application.properties:

razorpay.key.id=your_key_id  
razorpay.key.secret=your_secret_key  

Note: Do not expose your secret key publicly.

# Future Improvements
- Deploy frontend & backend
- Improve UI responsiveness
- Add inventory tracking
- Advanced analytics dashboard

---

# Author
Amit Lodhi  
GitHub: https://github.com/amitlodhi0156
