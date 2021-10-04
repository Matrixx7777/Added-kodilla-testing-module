package com.kodilla.patterns2.observer.homework;

public interface KodillaObservable {
    void studentHasMentor(Mentor mentor);
    void hasAcceptedTaskBy(Mentor mentor);
    void showNotify();
    void hasUnacceptedTaskBy(Mentor mentor);
}
