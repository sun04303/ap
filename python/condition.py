participant = ["leo", "ads", "asd", "matilda"]
completion = ["leo", "ads", "matilda"]

for i in participant :
    for j in completion :
        if(i == j) :
            participant.remove(i)
            completion.remove(j)

print(participant[-1])