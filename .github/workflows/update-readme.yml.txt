name: 🛠 Auto Update README

on:
  schedule:
    - cron: '30 2 * * *'  # Every day at 8:00 AM IST (2:30 AM UTC)
  workflow_dispatch:       # Allow manual run too

jobs:
  update-readme:
    runs-on: ubuntu-latest

    steps:
      - name: 📥 Clone repository
        uses: actions/checkout@v3

      - name: 🐍 Set up Python
        uses: actions/setup-python@v4
        with:
          python-version: '3.10'

      - name: 📦 Install Python requirements (if any)
        run: |
          pip install -r requirements.txt || echo "no requirements.txt found"

      - name: 🧠 Run Concept & Log Scripts
        run: |
          python update_readme_concepts.py
          python update_readme_log.py

      - name: 📤 Commit & Push changes
        run: |
          git config --global user.name "Aadya2901"
          git config --global user.email "your-email@example.com"
          git add README.md
          git commit -m "🔁 Auto-update: Concepts & Logs" || echo "No changes to commit"
          git push
