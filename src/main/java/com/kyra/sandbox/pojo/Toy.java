package com.kyra.sandbox.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * Created by kannampallil_b on 4/22/15.
 */
@Getter @Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Toy implements Serializable {

    private static final long serialVersionUID = -7788619177798333712L;
    private int id;
    private String name;
    private String gender;
    private String title;
}
