# Grade Report Assignment

def average(scores_list):
    total = 0
    for s in scores_list:
        total += s
    return total / len(scores_list)

def letter(avg_val):
    if avg_val >= 80:
        return "A"
    elif avg_val >= 70:
        return "B"
    elif avg_val >= 60:
        return "C"
    elif avg_val >= 50:
        return "D"
    else:
        return "F"

# Store 5 exam scores
scores = [72, 85, 65, 90, 55]

print("Listing all exam scores:")
for i in range(len(scores)):
    print(f"Score {i + 1}: {scores[i]}")

the_avg = average(scores)
the_grade = letter(the_avg)

print(f"\nAverage: {the_avg:.2f} ({the_grade})")