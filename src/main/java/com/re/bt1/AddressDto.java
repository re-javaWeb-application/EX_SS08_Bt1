package com.re.bt1;

import javax.validation.constraints.NotBlank;

public class AddressDto {
    @NotBlank(message = "Ten nguoi nhan khong duoc de trong")
    private String receiverName;

    @NotBlank(message = "Dia chi khong duoc de trong")
    private String detailedAddress;

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }
}
