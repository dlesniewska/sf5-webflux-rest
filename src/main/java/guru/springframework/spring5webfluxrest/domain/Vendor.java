package guru.springframework.spring5webfluxrest.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    //    private String name;
//
//    @JsonProperty("vendor_url")
//    private String vendorUrl;
}
