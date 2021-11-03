package com.didiglobal.logi.elasticsearch.client.parser.dsl.parser.query;

import com.alibaba.fastjson.JSONObject;
import com.didiglobal.logi.elasticsearch.client.parser.dsl.ast.common.KeyWord;
import com.didiglobal.logi.elasticsearch.client.parser.dsl.ast.common.multi.NodeMap;
import com.didiglobal.logi.elasticsearch.client.parser.dsl.ast.query.Match;
import com.didiglobal.logi.elasticsearch.client.parser.dsl.parser.DslParser;
import com.didiglobal.logi.elasticsearch.client.parser.dsl.parser.ParserType;

public class MatchParser extends DslParser {

    public MatchParser(ParserType type) {
        super(type);
    }

    @Override
    public KeyWord parse(String name, Object obj) throws Exception {
        Match node = new Match(name);
        NodeMap.toField4Value((JSONObject) obj, node.m);
        return node;
    }
}