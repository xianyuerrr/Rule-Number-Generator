CREATE TABLE TBL_NUMBER_GENERATOR_RULE_SEGMENT
(
    rule_segment_id      BIGINT  NOT NULL COMMENT '规则段Id',
    rule_id              BIGINT  NOT NULL COMMENT '规则Id',
    segment_idx          INTEGER NOT NULL COMMENT '规则段下标，拼接编码时按照下标顺序拼接',
    segment_name         NVARCHAR(255) COMMENT '规则段名称',
    description          NVARCHAR(500) COMMENT '规则段描述',
    max_length           INTEGER COMMENT '规则段最大长度',
    segment_type         NVARCHAR(100) COMMENT '规则段类型，有固定值（STRING）、时间序列（DATE）、动态参数（DYNAMIC）、数字序列（SEQUENCE）四种',
    text                 NVARCHAR(100) COMMENT '固定值（当规则段类型为STRING时有效）',
    format_key           NVARCHAR(100) COMMENT '时间序列格式，当规则段类型为DATE时有效',
    attribute_name       NVARCHAR(100) COMMENT '动态参数名，当规则段类型为DYNAMIC时有效',
    attribute_clz        NVARCHAR(128) COMMENT '动态参数类型名，当规则段类型为DYNAMIC时有效',
    sequence_from        BIGINT COMMENT '数字序列最小值，当规则段类型为SEQUENCE时有效',
    sequence_to          BIGINT COMMENT '数字序列最大值，当规则段类型为SEQUENCE时有效',
    padding              NVARCHAR(1) COMMENT '数字序列填充字符，当数字序列最高位为空时使用该字段进行填充，当规则段类型为SEQUENCE时有效',
    independent_sequence NVARCHAR(1) COMMENT '编号规则中其他段不同时，序列是否独立计算，取值为Y或N'
) COMMENT '规则段内容定义表';
ALTER TABLE TBL_NUMBER_GENERATOR_RULE_SEGMENT
    ADD CONSTRAINT KEY_TBL_NUMBER_GENERATOR_RULE_SEGMENT PRIMARY KEY (rule_segment_id);
CREATE INDEX idx_rule ON TBL_NUMBER_GENERATOR_RULE_SEGMENT (rule_id);
