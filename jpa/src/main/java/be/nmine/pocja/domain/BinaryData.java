package be.nmine.pocja.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Table(name = "binary_data")
public class BinaryData {
    @Id
    @GeneratedValue
    private int binary_data;

    @Lob
    private byte[] data;
}
