package sa.kafd.ebsaris.httpBodies.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GenericErrorMessage {
    private String errorMessage;
    private int errorCode;
}
