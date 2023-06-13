CREATE TABLE TBL_NUMBER_GENERATOR_RULE_SEQUENCE_RECORD
(
    sequence_record_id    BIGINT NOT NULL COMMENT '序列记录Id',
    rule_segment_id       BIGINT NOT NULL COMMENT '规则Id',
    composition_key       NVARCHAR(100) COMMENT '动态参数组合生成的值',
    current_data_sequence NVARCHAR(64) COMMENT '当前时间序列的值',
    current_sequence      BIGINT COMMENT '当前数字序列的值'
) COMMENT '序列类型规则段值记录';
ALTER TABLE TBL_NUMBER_GENERATOR_RULE_SEQUENCE_RECORD
    ADD CONSTRAINT KEY_TBL_NUMBER_GENERATOR_RULE_SEQUENCE_RECORD PRIMARY KEY (sequence_record_id);
