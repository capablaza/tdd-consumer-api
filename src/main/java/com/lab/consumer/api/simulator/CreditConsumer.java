package com.lab.consumer.api.simulator;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class CreditConsumer {

    private String name;
    private String email;
    private Integer amount;
    private Integer quotas;
    private Integer income;

    public CreditConsumer(@NonNull String name, @NonNull String email, @NonNull Integer amount, @NonNull Integer quotas, @NonNull Integer income) {
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.quotas = quotas;
        this.income = income;
    }

    public boolean evaluate() {
        return false;
    }

}
