package org.kodejava.example.mybatis.persistence;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.kodejava.example.mybatis.domain.Record;

public interface RecordMapper {
    /**
     * Get a single Record from the database based on the record
     * identified.
     *
     * @param id record identifier.
     * @return a record object.
     */
    Record getRecord(int id);
}