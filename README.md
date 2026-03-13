# 🚀 Crypto Portfolio Dashboard

A Full-Stack application to manage a cryptocurrency portfolio in real-time. It allows users to keep track of their purchases, visually analyze their asset distribution, and get live valuations by consuming the public CoinGecko API. 

This project is fully dockerized, ensuring a seamless setup process across any environment.

## 🛠️ Tech Stack

* **Frontend:** Angular, TypeScript, Bootstrap 5, Chart.js
* **Backend:** Java, Spring Boot, Spring Data JPA, RESTful APIs
* **Database:** PostgreSQL
* **Infrastructure:** Docker & Docker Compose (Containerization & Nginx web server)
* **Integrations:** External CoinGecko API (Live Markets & Prices)

## ✨ Key Features

* **CRUD Operations:** Create, read, and delete purchase records seamlessly.
* **Real-Time Data:** Calculates current holdings by multiplying token amounts by live market prices via an external API.
* **Multi-Currency Support:** Dynamic toggling of the entire portfolio valuation between USD ($) and EUR (€) with a single click.
* **Dynamic Visualization:** Interactive Doughnut Chart that automatically renders and assigns colors based on active assets.
* **Zero-Config Deployment:** Fully containerized architecture means no local database or SDK installations are required to run the app.

## ⚙️ How to Run Locally

Thanks to Docker, running this Full-Stack application is incredibly simple. 

### Prerequisites
* [Docker Desktop](https://www.docker.com/products/docker-desktop/) installed and running on your machine.

### Quick Start
1. Clone this repository to your local machine:
   ```bash
   git clone [https://github.com/YOUR-USERNAME/YOUR-REPOSITORY-NAME.git](https://github.com/YOUR-USERNAME/YOUR-REPOSITORY-NAME.git)