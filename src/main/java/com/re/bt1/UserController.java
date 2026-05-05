package com.re.bt1;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class UserController {
    @PostMapping("/update")
    public ResponseEntity<String> updateAddress(
            @Valid @RequestBody AddressDto addressDto,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            String message = fieldError != null ? fieldError.getDefaultMessage() : "Du lieu khong hop le";
            return ResponseEntity.badRequest().body(message);
        }

        // Luu dia chi vao database o day.
        return ResponseEntity.ok("Cap nhat dia chi thanh cong!");
    }
}
