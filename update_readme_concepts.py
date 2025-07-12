import os

LOG_FILE = "concepts_log.txt"
README_FILE = "README.md"
START_MARK = "<!-- CONCEPTS_START -->"
END_MARK = "<!-- CONCEPTS_END -->"

def generate_concepts_table(log_file):
    rows = []
    if not os.path.exists(log_file):
        return "No concepts logged yet."

    with open(log_file, "r", encoding="utf-8") as file:
        for line in file:
            parts = [p.strip() for p in line.strip().split(",")]
            if len(parts) != 3:
                continue
            date, concept, path = parts
            file_link = f"[{path.split('/')[-1]}](./{path})"
            rows.append(f"| {date} | {concept} | {file_link} |")

    table = "\n".join([
        "| Date       | Concept              | Notes/Code Link |",
        "|------------|----------------------|------------------|",
        *rows
    ])
    return table

def update_readme():
    with open(README_FILE, "r", encoding="utf-8") as f:
        content = f.read()

    if START_MARK not in content or END_MARK not in content:
        print("❌ Concept markers not found in README.md")
        return

    before = content.split(START_MARK)[0] + START_MARK + "\n"
    after = "\n" + END_MARK + content.split(END_MARK)[1]

    new_table = generate_concepts_table(LOG_FILE)
    updated = before + new_table + after

    with open(README_FILE, "w", encoding="utf-8") as f:
        f.write(updated)

    print("✅ README.md updated with Concepts Learned section.")

if __name__ == "__main__":
    update_readme()
