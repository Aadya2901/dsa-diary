import os
import datetime

# === CONFIG ===
FOLDER_PATH = "E:\\skillsssss\\dsa\\java"
README_PATH = os.path.join(FOLDER_PATH, "README.md")
LOG_START = "<!-- DAILY_LOG_START -->"
LOG_END = "<!-- DAILY_LOG_END -->"

# === GET TODAY ===
today = datetime.date.today().strftime("%B %d, %Y")

# === FIND ALL .java FILES ===
problem_files = []
for root, dirs, files in os.walk(FOLDER_PATH):
    for file in files:
        if file.endswith(".java"):
            rel_path = os.path.relpath(os.path.join(root, file), FOLDER_PATH)
            problem_files.append(rel_path.replace("\\", "/"))

# Format list of files
file_list_md = "\n".join([f"- {f}" for f in sorted(problem_files)])

# === READ README ===
with open(README_PATH, "r", encoding="utf-8") as f:
    content = f.read()

# === SPLIT INTO PARTS ===
before = content.split(LOG_START)[0] + LOG_START + "\n"
after = "\n" + LOG_END + content.split(LOG_END)[1]

# === CREATE TODAY'S ENTRY ===
today_entry = f"### ✅ {today}\n{file_list_md}\n"

# === PREVENT DUPLICATE ===
if today_entry.strip() in content:
    print("🔁 Today's log already exists. No update needed.")
else:
    updated = before + today_entry + after
    with open(README_PATH, "w", encoding="utf-8") as f:
        f.write(updated)
    print("✅ README.md updated with today's log.")
