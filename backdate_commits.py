import os
import subprocess
from datetime import datetime

folder_path = "."  # your repo folder

for root, dirs, files in os.walk(folder_path):
    for file in files:
        if file.endswith(".java"):
            full_path = os.path.join(root, file)
            mtime = os.path.getmtime(full_path)
            dt = datetime.fromtimestamp(mtime)
            git_date = dt.strftime('%Y-%m-%dT%H:%M:%S')

            subprocess.run(["git", "add", full_path])

            subprocess.run([
                "git", "commit",
                "--date", git_date,
                "-m", f"📝 Auto commit: {file} (edited on {dt.date()})"
            ])
