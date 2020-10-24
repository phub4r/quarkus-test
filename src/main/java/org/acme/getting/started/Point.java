package org.acme.getting.started;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Point {
    private int x;
    private int y;
}
