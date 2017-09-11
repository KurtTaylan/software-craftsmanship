package com.craftsmanship.behavioralPatterns.example3;

interface Base {
    void execute(Base target);

    void doJob(FOO target);

    void doJob(BAR target);

    void doJob(BAZ target);
}
