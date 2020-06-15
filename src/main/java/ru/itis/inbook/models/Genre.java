package ru.itis.inbook.models;

public enum Genre {
    ForChildren(0),
    Fantasy(1),
    Adventure(2),
    Romance(3),
    Contemporary(4),
    Dystopian(5),
    Mystery(6),
    Horror(7),
    Thriller(8),
    Paranormal(9),
    HistoricalFiction(10),
    ScienceFiction(11),
    Memoir(12),
    Cooking(13),
    Art(14),
    Personal(15),
    Development(16),
    Motivational(17),
    Health(18),
    History(19),
    Travel(20),
    Guide(21),
    FamiliesRelationships(22),
    Humor(23);


    private int id;

    Genre(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
