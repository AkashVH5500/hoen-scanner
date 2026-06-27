# 🔍 Hoen Scanner

Hoen Scanner is a lightweight microservice designed to analyze files and detect potential threats using automated scanning techniques. It is built as part of a scalable malware detection architecture and can be integrated into larger cybersecurity platforms for secure file analysis.

---

## 📖 Overview

The scanner receives files for analysis, performs security checks, and returns scan results through a REST API. It is designed to work as an independent microservice while supporting integration with message queues and backend services.

---

## 🚀 Features

* 🔍 File Scanning
* 🦠 Malware Detection Support
* ⚡ REST API
* 📦 Microservice Architecture
* 🔄 Queue-Based Integration
* 📊 Scan Status Reporting
* 📝 Logging
* 🐳 Docker Support
* ☁️ Easy Deployment

---

## 🛠️ Technologies Used

* Python
* FastAPI
* Docker
* RabbitMQ
* REST API
* JSON
* Logging

---

## 📂 Project Structure

```text
hoen-scanner/
│
├── app/                 # Scanner application
├── Dockerfile           # Docker configuration
├── requirements.txt     # Python dependencies
├── README.md
└── ...
```

---

## ⚙️ Installation

### Clone the Repository

```bash
git clone https://github.com/AkashVH5500/hoen-scanner.git

cd hoen-scanner
```

### Install Dependencies

```bash
pip install -r requirements.txt
```

---

## ▶️ Running the Service

Start the scanner locally:

```bash
python main.py
```

or, if using FastAPI:

```bash
uvicorn app.main:app --reload
```

---

## 🐳 Running with Docker

Build the Docker image:

```bash
docker build -t hoen-scanner .
```

Run the container:

```bash
docker run -p 8000:8000 hoen-scanner
```

---

## 🔄 Workflow

```text
Client
   │
   ▼
Upload File
   │
   ▼
Hoen Scanner
   │
   ▼
Threat Analysis
   │
   ▼
Scan Result
```

---

## 📈 Future Improvements

* Multi-engine malware scanning
* Virus signature updates
* File hash verification
* PDF & Office document scanning
* Email attachment scanning
* Dashboard for scan history
* Cloud deployment
* Kubernetes support

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository.
2. Create a feature branch.

```bash
git checkout -b feature-name
```

3. Commit your changes.

```bash
git commit -m "Add new feature"
```

4. Push your branch.

```bash
git push origin feature-name
```

5. Open a Pull Request.

---

## 📄 License

This project is intended for educational and research purposes.

---

## 👨‍💻 Author

**Akash V Hiremath**

Computer Science Engineering Student | AI & Cybersecurity Enthusiast

GitHub: https://github.com/AkashVH5500
