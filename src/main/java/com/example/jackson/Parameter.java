
package com.example.jackson;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LANG",
    "STATS_DATA_ID",
    "NARROWING_COND",
    "DATA_FORMAT",
    "START_POSITION",
    "METAGET_FLG",
    "EXPLANATION_GET_FLG",
    "ANNOTATION_GET_FLG",
    "REPLACE_SP_CHARS",
    "CNT_GET_FLG",
    "SECTION_HEADER_FLG"
})
@Generated("jsonschema2pojo")
public class Parameter {

    @JsonProperty("LANG")
    private String lang;
    @JsonProperty("STATS_DATA_ID")
    private String statsDataId;
    @JsonProperty("NARROWING_COND")
    private NarrowingCond narrowingCond;
    @JsonProperty("DATA_FORMAT")
    private String dataFormat;
    @JsonProperty("START_POSITION")
    private Integer startPosition;
    @JsonProperty("METAGET_FLG")
    private String metagetFlg;
    @JsonProperty("EXPLANATION_GET_FLG")
    private String explanationGetFlg;
    @JsonProperty("ANNOTATION_GET_FLG")
    private String annotationGetFlg;
    @JsonProperty("REPLACE_SP_CHARS")
    private Integer replaceSpChars;
    @JsonProperty("CNT_GET_FLG")
    private String cntGetFlg;
    @JsonProperty("SECTION_HEADER_FLG")
    private Integer sectionHeaderFlg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LANG")
    public String getLang() {
        return lang;
    }

    @JsonProperty("LANG")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("STATS_DATA_ID")
    public String getStatsDataId() {
        return statsDataId;
    }

    @JsonProperty("STATS_DATA_ID")
    public void setStatsDataId(String statsDataId) {
        this.statsDataId = statsDataId;
    }

    @JsonProperty("NARROWING_COND")
    public NarrowingCond getNarrowingCond() {
        return narrowingCond;
    }

    @JsonProperty("NARROWING_COND")
    public void setNarrowingCond(NarrowingCond narrowingCond) {
        this.narrowingCond = narrowingCond;
    }

    @JsonProperty("DATA_FORMAT")
    public String getDataFormat() {
        return dataFormat;
    }

    @JsonProperty("DATA_FORMAT")
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    @JsonProperty("START_POSITION")
    public Integer getStartPosition() {
        return startPosition;
    }

    @JsonProperty("START_POSITION")
    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    @JsonProperty("METAGET_FLG")
    public String getMetagetFlg() {
        return metagetFlg;
    }

    @JsonProperty("METAGET_FLG")
    public void setMetagetFlg(String metagetFlg) {
        this.metagetFlg = metagetFlg;
    }

    @JsonProperty("EXPLANATION_GET_FLG")
    public String getExplanationGetFlg() {
        return explanationGetFlg;
    }

    @JsonProperty("EXPLANATION_GET_FLG")
    public void setExplanationGetFlg(String explanationGetFlg) {
        this.explanationGetFlg = explanationGetFlg;
    }

    @JsonProperty("ANNOTATION_GET_FLG")
    public String getAnnotationGetFlg() {
        return annotationGetFlg;
    }

    @JsonProperty("ANNOTATION_GET_FLG")
    public void setAnnotationGetFlg(String annotationGetFlg) {
        this.annotationGetFlg = annotationGetFlg;
    }

    @JsonProperty("REPLACE_SP_CHARS")
    public Integer getReplaceSpChars() {
        return replaceSpChars;
    }

    @JsonProperty("REPLACE_SP_CHARS")
    public void setReplaceSpChars(Integer replaceSpChars) {
        this.replaceSpChars = replaceSpChars;
    }

    @JsonProperty("CNT_GET_FLG")
    public String getCntGetFlg() {
        return cntGetFlg;
    }

    @JsonProperty("CNT_GET_FLG")
    public void setCntGetFlg(String cntGetFlg) {
        this.cntGetFlg = cntGetFlg;
    }

    @JsonProperty("SECTION_HEADER_FLG")
    public Integer getSectionHeaderFlg() {
        return sectionHeaderFlg;
    }

    @JsonProperty("SECTION_HEADER_FLG")
    public void setSectionHeaderFlg(Integer sectionHeaderFlg) {
        this.sectionHeaderFlg = sectionHeaderFlg;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
