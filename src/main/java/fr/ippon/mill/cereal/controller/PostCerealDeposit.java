package fr.ippon.mill.cereal.controller;

import java.util.UUID;
import java.time.LocalDate;

public class PostCerealDeposit {

    private LocalDate depositDay;
    private UUID idCereal;
    private float quantity;

    public LocalDate getDepositDay() {
        return depositDay;
    }

    public UUID getIdCereal() {
        return idCereal;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setDepositDay(LocalDate depositDay) {
        this.depositDay = depositDay;
    }

    public void setIdCereal(UUID idCereal) {
        this.idCereal = idCereal;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

}