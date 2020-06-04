// $ANTLR 3.5.2 org/apache/hadoop/hive/ql/parse/HiveLexer.g 2019-11-19 07:53:49

package org.apache.hadoop.hive.ql.parse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.conf.HiveConf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings("all")
public class HiveLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int BITWISEOR=5;
	public static final int BITWISEXOR=6;
	public static final int ByteLengthLiteral=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int CONCATENATE=10;
	public static final int CharSetLiteral=11;
	public static final int CharSetName=12;
	public static final int DIV=13;
	public static final int DIVIDE=14;
	public static final int DOLLAR=15;
	public static final int DOT=16;
	public static final int Digit=17;
	public static final int EQUAL=18;
	public static final int EQUAL_NS=19;
	public static final int Exponent=20;
	public static final int GREATERTHAN=21;
	public static final int GREATERTHANOREQUALTO=22;
	public static final int HexDigit=23;
	public static final int Identifier=24;
	public static final int IntegralLiteral=25;
	public static final int KW_ABORT=26;
	public static final int KW_ACTIVATE=27;
	public static final int KW_ACTIVE=28;
	public static final int KW_ADD=29;
	public static final int KW_ADMIN=30;
	public static final int KW_AFTER=31;
	public static final int KW_ALL=32;
	public static final int KW_ALLOC_FRACTION=33;
	public static final int KW_ALTER=34;
	public static final int KW_ANALYZE=35;
	public static final int KW_AND=36;
	public static final int KW_ANY=37;
	public static final int KW_APPLICATION=38;
	public static final int KW_ARCHIVE=39;
	public static final int KW_ARRAY=40;
	public static final int KW_AS=41;
	public static final int KW_ASC=42;
	public static final int KW_AUTHORIZATION=43;
	public static final int KW_AUTOCOMMIT=44;
	public static final int KW_BEFORE=45;
	public static final int KW_BETWEEN=46;
	public static final int KW_BIGINT=47;
	public static final int KW_BINARY=48;
	public static final int KW_BOOLEAN=49;
	public static final int KW_BOTH=50;
	public static final int KW_BUCKET=51;
	public static final int KW_BUCKETS=52;
	public static final int KW_BY=53;
	public static final int KW_CACHE=54;
	public static final int KW_CASCADE=55;
	public static final int KW_CASE=56;
	public static final int KW_CAST=57;
	public static final int KW_CBO=58;
	public static final int KW_CHANGE=59;
	public static final int KW_CHAR=60;
	public static final int KW_CHECK=61;
	public static final int KW_CLUSTER=62;
	public static final int KW_CLUSTERED=63;
	public static final int KW_CLUSTERSTATUS=64;
	public static final int KW_COLLECTION=65;
	public static final int KW_COLUMN=66;
	public static final int KW_COLUMNS=67;
	public static final int KW_COMMENT=68;
	public static final int KW_COMMIT=69;
	public static final int KW_COMPACT=70;
	public static final int KW_COMPACTIONS=71;
	public static final int KW_COMPUTE=72;
	public static final int KW_CONCATENATE=73;
	public static final int KW_CONF=74;
	public static final int KW_CONSTRAINT=75;
	public static final int KW_CONTINUE=76;
	public static final int KW_COST=77;
	public static final int KW_CREATE=78;
	public static final int KW_CROSS=79;
	public static final int KW_CUBE=80;
	public static final int KW_CURRENT=81;
	public static final int KW_CURRENT_DATE=82;
	public static final int KW_CURRENT_TIMESTAMP=83;
	public static final int KW_CURSOR=84;
	public static final int KW_DATA=85;
	public static final int KW_DATABASE=86;
	public static final int KW_DATABASES=87;
	public static final int KW_DATE=88;
	public static final int KW_DATETIME=89;
	public static final int KW_DAY=90;
	public static final int KW_DBPROPERTIES=91;
	public static final int KW_DEBUG=92;
	public static final int KW_DECIMAL=93;
	public static final int KW_DEFAULT=94;
	public static final int KW_DEFERRED=95;
	public static final int KW_DEFINED=96;
	public static final int KW_DELETE=97;
	public static final int KW_DELIMITED=98;
	public static final int KW_DEPENDENCY=99;
	public static final int KW_DESC=100;
	public static final int KW_DESCRIBE=101;
	public static final int KW_DETAIL=102;
	public static final int KW_DIRECTORIES=103;
	public static final int KW_DIRECTORY=104;
	public static final int KW_DISABLE=105;
	public static final int KW_DISTINCT=106;
	public static final int KW_DISTRIBUTE=107;
	public static final int KW_DISTRIBUTED=108;
	public static final int KW_DO=109;
	public static final int KW_DOUBLE=110;
	public static final int KW_DOW=111;
	public static final int KW_DROP=112;
	public static final int KW_DUMP=113;
	public static final int KW_ELEM_TYPE=114;
	public static final int KW_ELSE=115;
	public static final int KW_ENABLE=116;
	public static final int KW_END=117;
	public static final int KW_ENFORCED=118;
	public static final int KW_ESCAPED=119;
	public static final int KW_EXCEPT=120;
	public static final int KW_EXCHANGE=121;
	public static final int KW_EXCLUSIVE=122;
	public static final int KW_EXISTS=123;
	public static final int KW_EXPLAIN=124;
	public static final int KW_EXPORT=125;
	public static final int KW_EXPRESSION=126;
	public static final int KW_EXTENDED=127;
	public static final int KW_EXTERNAL=128;
	public static final int KW_EXTRACT=129;
	public static final int KW_FALSE=130;
	public static final int KW_FETCH=131;
	public static final int KW_FIELDS=132;
	public static final int KW_FILE=133;
	public static final int KW_FILEFORMAT=134;
	public static final int KW_FIRST=135;
	public static final int KW_FLOAT=136;
	public static final int KW_FLOOR=137;
	public static final int KW_FOLLOWING=138;
	public static final int KW_FOR=139;
	public static final int KW_FORCE=140;
	public static final int KW_FOREIGN=141;
	public static final int KW_FORMAT=142;
	public static final int KW_FORMATTED=143;
	public static final int KW_FROM=144;
	public static final int KW_FULL=145;
	public static final int KW_FUNCTION=146;
	public static final int KW_FUNCTIONS=147;
	public static final int KW_GRANT=148;
	public static final int KW_GROUP=149;
	public static final int KW_GROUPING=150;
	public static final int KW_HAVING=151;
	public static final int KW_HOUR=152;
	public static final int KW_IDXPROPERTIES=153;
	public static final int KW_IF=154;
	public static final int KW_IMPORT=155;
	public static final int KW_IN=156;
	public static final int KW_INDEX=157;
	public static final int KW_INDEXES=158;
	public static final int KW_INNER=159;
	public static final int KW_INPATH=160;
	public static final int KW_INPUTDRIVER=161;
	public static final int KW_INPUTFORMAT=162;
	public static final int KW_INSERT=163;
	public static final int KW_INT=164;
	public static final int KW_INTERSECT=165;
	public static final int KW_INTERVAL=166;
	public static final int KW_INTO=167;
	public static final int KW_IS=168;
	public static final int KW_ISOLATION=169;
	public static final int KW_ITEMS=170;
	public static final int KW_JAR=171;
	public static final int KW_JOIN=172;
	public static final int KW_JOINCOST=173;
	public static final int KW_KEY=174;
	public static final int KW_KEYS=175;
	public static final int KW_KEY_TYPE=176;
	public static final int KW_KILL=177;
	public static final int KW_LAST=178;
	public static final int KW_LATERAL=179;
	public static final int KW_LEFT=180;
	public static final int KW_LESS=181;
	public static final int KW_LEVEL=182;
	public static final int KW_LIKE=183;
	public static final int KW_LIMIT=184;
	public static final int KW_LINES=185;
	public static final int KW_LOAD=186;
	public static final int KW_LOCAL=187;
	public static final int KW_LOCATION=188;
	public static final int KW_LOCK=189;
	public static final int KW_LOCKS=190;
	public static final int KW_LOGICAL=191;
	public static final int KW_LONG=192;
	public static final int KW_MACRO=193;
	public static final int KW_MANAGEMENT=194;
	public static final int KW_MAP=195;
	public static final int KW_MAPJOIN=196;
	public static final int KW_MAPPING=197;
	public static final int KW_MATCHED=198;
	public static final int KW_MATERIALIZED=199;
	public static final int KW_MERGE=200;
	public static final int KW_METADATA=201;
	public static final int KW_MINUS=202;
	public static final int KW_MINUTE=203;
	public static final int KW_MONTH=204;
	public static final int KW_MORE=205;
	public static final int KW_MOVE=206;
	public static final int KW_MSCK=207;
	public static final int KW_NONE=208;
	public static final int KW_NORELY=209;
	public static final int KW_NOSCAN=210;
	public static final int KW_NOT=211;
	public static final int KW_NOVALIDATE=212;
	public static final int KW_NULL=213;
	public static final int KW_NULLS=214;
	public static final int KW_OF=215;
	public static final int KW_OFFSET=216;
	public static final int KW_ON=217;
	public static final int KW_ONLY=218;
	public static final int KW_OPERATOR=219;
	public static final int KW_OPTION=220;
	public static final int KW_OR=221;
	public static final int KW_ORDER=222;
	public static final int KW_OUT=223;
	public static final int KW_OUTER=224;
	public static final int KW_OUTPUTDRIVER=225;
	public static final int KW_OUTPUTFORMAT=226;
	public static final int KW_OVER=227;
	public static final int KW_OVERWRITE=228;
	public static final int KW_OWNER=229;
	public static final int KW_PARTITION=230;
	public static final int KW_PARTITIONED=231;
	public static final int KW_PARTITIONS=232;
	public static final int KW_PATH=233;
	public static final int KW_PERCENT=234;
	public static final int KW_PLAN=235;
	public static final int KW_PLANS=236;
	public static final int KW_PLUS=237;
	public static final int KW_POOL=238;
	public static final int KW_PRECEDING=239;
	public static final int KW_PRECISION=240;
	public static final int KW_PRESERVE=241;
	public static final int KW_PRIMARY=242;
	public static final int KW_PRINCIPALS=243;
	public static final int KW_PROCEDURE=244;
	public static final int KW_PURGE=245;
	public static final int KW_QUARTER=246;
	public static final int KW_QUERY=247;
	public static final int KW_QUERY_PARALLELISM=248;
	public static final int KW_RANGE=249;
	public static final int KW_READ=250;
	public static final int KW_READS=251;
	public static final int KW_REBUILD=252;
	public static final int KW_RECORDREADER=253;
	public static final int KW_RECORDWRITER=254;
	public static final int KW_REDUCE=255;
	public static final int KW_REFERENCES=256;
	public static final int KW_REGEXP=257;
	public static final int KW_RELOAD=258;
	public static final int KW_RELY=259;
	public static final int KW_RENAME=260;
	public static final int KW_REOPTIMIZATION=261;
	public static final int KW_REPAIR=262;
	public static final int KW_REPL=263;
	public static final int KW_REPLACE=264;
	public static final int KW_REPLICATION=265;
	public static final int KW_RESOURCE=266;
	public static final int KW_RESTRICT=267;
	public static final int KW_REVOKE=268;
	public static final int KW_REWRITE=269;
	public static final int KW_RIGHT=270;
	public static final int KW_RLIKE=271;
	public static final int KW_ROLE=272;
	public static final int KW_ROLES=273;
	public static final int KW_ROLLBACK=274;
	public static final int KW_ROLLUP=275;
	public static final int KW_ROW=276;
	public static final int KW_ROWS=277;
	public static final int KW_SCHEDULING_POLICY=278;
	public static final int KW_SCHEMA=279;
	public static final int KW_SCHEMAS=280;
	public static final int KW_SECOND=281;
	public static final int KW_SELECT=282;
	public static final int KW_SEMI=283;
	public static final int KW_SERDE=284;
	public static final int KW_SERDEPROPERTIES=285;
	public static final int KW_SERVER=286;
	public static final int KW_SET=287;
	public static final int KW_SETS=288;
	public static final int KW_SHARED=289;
	public static final int KW_SHOW=290;
	public static final int KW_SHOW_DATABASE=291;
	public static final int KW_SKEWED=292;
	public static final int KW_SMALLINT=293;
	public static final int KW_SNAPSHOT=294;
	public static final int KW_SORT=295;
	public static final int KW_SORTED=296;
	public static final int KW_SSL=297;
	public static final int KW_START=298;
	public static final int KW_STATISTICS=299;
	public static final int KW_STATUS=300;
	public static final int KW_STORED=301;
	public static final int KW_STREAMTABLE=302;
	public static final int KW_STRING=303;
	public static final int KW_STRUCT=304;
	public static final int KW_SUMMARY=305;
	public static final int KW_SYNC=306;
	public static final int KW_TABLE=307;
	public static final int KW_TABLES=308;
	public static final int KW_TABLESAMPLE=309;
	public static final int KW_TBLPROPERTIES=310;
	public static final int KW_TEMPORARY=311;
	public static final int KW_TERMINATED=312;
	public static final int KW_THEN=313;
	public static final int KW_TIME=314;
	public static final int KW_TIMESTAMP=315;
	public static final int KW_TIMESTAMPLOCALTZ=316;
	public static final int KW_TINYINT=317;
	public static final int KW_TO=318;
	public static final int KW_TOUCH=319;
	public static final int KW_TRANSACTION=320;
	public static final int KW_TRANSACTIONAL=321;
	public static final int KW_TRANSACTIONS=322;
	public static final int KW_TRANSFORM=323;
	public static final int KW_TRIGGER=324;
	public static final int KW_TRUE=325;
	public static final int KW_TRUNCATE=326;
	public static final int KW_UNARCHIVE=327;
	public static final int KW_UNBOUNDED=328;
	public static final int KW_UNDO=329;
	public static final int KW_UNION=330;
	public static final int KW_UNIONTYPE=331;
	public static final int KW_UNIQUE=332;
	public static final int KW_UNIQUEJOIN=333;
	public static final int KW_UNLOCK=334;
	public static final int KW_UNMANAGED=335;
	public static final int KW_UNSET=336;
	public static final int KW_UNSIGNED=337;
	public static final int KW_UPDATE=338;
	public static final int KW_URI=339;
	public static final int KW_USE=340;
	public static final int KW_USER=341;
	public static final int KW_USING=342;
	public static final int KW_UTC=343;
	public static final int KW_UTCTIMESTAMP=344;
	public static final int KW_VALIDATE=345;
	public static final int KW_VALUES=346;
	public static final int KW_VALUE_TYPE=347;
	public static final int KW_VARCHAR=348;
	public static final int KW_VECTORIZATION=349;
	public static final int KW_VIEW=350;
	public static final int KW_VIEWS=351;
	public static final int KW_WAIT=352;
	public static final int KW_WEEK=353;
	public static final int KW_WHEN=354;
	public static final int KW_WHERE=355;
	public static final int KW_WHILE=356;
	public static final int KW_WINDOW=357;
	public static final int KW_WITH=358;
	public static final int KW_WORK=359;
	public static final int KW_WORKLOAD=360;
	public static final int KW_WRITE=361;
	public static final int KW_YEAR=362;
	public static final int KW_ZONE=363;
	public static final int LCURLY=364;
	public static final int LESSTHAN=365;
	public static final int LESSTHANOREQUALTO=366;
	public static final int LINE_COMMENT=367;
	public static final int LPAREN=368;
	public static final int LSQUARE=369;
	public static final int Letter=370;
	public static final int MINUS=371;
	public static final int MOD=372;
	public static final int NOTEQUAL=373;
	public static final int Number=374;
	public static final int NumberLiteral=375;
	public static final int PLUS=376;
	public static final int QUERY_HINT=377;
	public static final int QUESTION=378;
	public static final int QuotedIdentifier=379;
	public static final int RCURLY=380;
	public static final int RPAREN=381;
	public static final int RSQUARE=382;
	public static final int RegexComponent=383;
	public static final int SEMICOLON=384;
	public static final int STAR=385;
	public static final int StringLiteral=386;
	public static final int TILDE=387;
	public static final int WS=388;

	  private Configuration hiveConf;
	  
	  public void setHiveConf(Configuration hiveConf) {
	    this.hiveConf = hiveConf;
	  }
	  
	  protected boolean allowQuotedId() {
	    if(hiveConf == null){
	      return false;
	    }
	    String supportedQIds = HiveConf.getVar(hiveConf, HiveConf.ConfVars.HIVE_QUOTEDID_SUPPORT);
	    return !"none".equals(supportedQIds);
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HiveLexer() {} 
	public HiveLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HiveLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org/apache/hadoop/hive/ql/parse/HiveLexer.g"; }

	// $ANTLR start "KW_TRUE"
	public final void mKW_TRUE() throws RecognitionException {
		try {
			int _type = KW_TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:44:9: ( 'TRUE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:44:11: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUE"

	// $ANTLR start "KW_FALSE"
	public final void mKW_FALSE() throws RecognitionException {
		try {
			int _type = KW_FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:45:10: ( 'FALSE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:45:12: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FALSE"

	// $ANTLR start "KW_ALL"
	public final void mKW_ALL() throws RecognitionException {
		try {
			int _type = KW_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:46:8: ( 'ALL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:46:10: 'ALL'
			{
			match("ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALL"

	// $ANTLR start "KW_NONE"
	public final void mKW_NONE() throws RecognitionException {
		try {
			int _type = KW_NONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:47:8: ( 'NONE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:47:10: 'NONE'
			{
			match("NONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NONE"

	// $ANTLR start "KW_AND"
	public final void mKW_AND() throws RecognitionException {
		try {
			int _type = KW_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:48:8: ( 'AND' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:48:10: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AND"

	// $ANTLR start "KW_OR"
	public final void mKW_OR() throws RecognitionException {
		try {
			int _type = KW_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:49:7: ( 'OR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:49:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OR"

	// $ANTLR start "KW_NOT"
	public final void mKW_NOT() throws RecognitionException {
		try {
			int _type = KW_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:50:8: ( 'NOT' | '!' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='N') ) {
				alt1=1;
			}
			else if ( (LA1_0=='!') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:50:10: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:50:18: '!'
					{
					match('!'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOT"

	// $ANTLR start "KW_LIKE"
	public final void mKW_LIKE() throws RecognitionException {
		try {
			int _type = KW_LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:51:9: ( 'LIKE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:51:11: 'LIKE'
			{
			match("LIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIKE"

	// $ANTLR start "KW_ANY"
	public final void mKW_ANY() throws RecognitionException {
		try {
			int _type = KW_ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:52:8: ( 'ANY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:52:10: 'ANY'
			{
			match("ANY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANY"

	// $ANTLR start "KW_IF"
	public final void mKW_IF() throws RecognitionException {
		try {
			int _type = KW_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:54:7: ( 'IF' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:54:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IF"

	// $ANTLR start "KW_EXISTS"
	public final void mKW_EXISTS() throws RecognitionException {
		try {
			int _type = KW_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:55:11: ( 'EXISTS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:55:13: 'EXISTS'
			{
			match("EXISTS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXISTS"

	// $ANTLR start "KW_ASC"
	public final void mKW_ASC() throws RecognitionException {
		try {
			int _type = KW_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:57:8: ( 'ASC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:57:10: 'ASC'
			{
			match("ASC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ASC"

	// $ANTLR start "KW_DESC"
	public final void mKW_DESC() throws RecognitionException {
		try {
			int _type = KW_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:58:9: ( 'DESC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:58:11: 'DESC'
			{
			match("DESC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESC"

	// $ANTLR start "KW_NULLS"
	public final void mKW_NULLS() throws RecognitionException {
		try {
			int _type = KW_NULLS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:59:10: ( 'NULLS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:59:12: 'NULLS'
			{
			match("NULLS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULLS"

	// $ANTLR start "KW_LAST"
	public final void mKW_LAST() throws RecognitionException {
		try {
			int _type = KW_LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:60:9: ( 'LAST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:60:11: 'LAST'
			{
			match("LAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LAST"

	// $ANTLR start "KW_ORDER"
	public final void mKW_ORDER() throws RecognitionException {
		try {
			int _type = KW_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:61:10: ( 'ORDER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:61:12: 'ORDER'
			{
			match("ORDER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ORDER"

	// $ANTLR start "KW_GROUP"
	public final void mKW_GROUP() throws RecognitionException {
		try {
			int _type = KW_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:62:10: ( 'GROUP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:62:12: 'GROUP'
			{
			match("GROUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUP"

	// $ANTLR start "KW_BY"
	public final void mKW_BY() throws RecognitionException {
		try {
			int _type = KW_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:63:7: ( 'BY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:63:9: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BY"

	// $ANTLR start "KW_HAVING"
	public final void mKW_HAVING() throws RecognitionException {
		try {
			int _type = KW_HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:64:11: ( 'HAVING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:64:13: 'HAVING'
			{
			match("HAVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HAVING"

	// $ANTLR start "KW_WHERE"
	public final void mKW_WHERE() throws RecognitionException {
		try {
			int _type = KW_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:65:10: ( 'WHERE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:65:12: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHERE"

	// $ANTLR start "KW_FROM"
	public final void mKW_FROM() throws RecognitionException {
		try {
			int _type = KW_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:66:9: ( 'FROM' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:66:11: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FROM"

	// $ANTLR start "KW_AS"
	public final void mKW_AS() throws RecognitionException {
		try {
			int _type = KW_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:67:7: ( 'AS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:67:9: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AS"

	// $ANTLR start "KW_SELECT"
	public final void mKW_SELECT() throws RecognitionException {
		try {
			int _type = KW_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:68:11: ( 'SELECT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:68:13: 'SELECT'
			{
			match("SELECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SELECT"

	// $ANTLR start "KW_DISTINCT"
	public final void mKW_DISTINCT() throws RecognitionException {
		try {
			int _type = KW_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:69:13: ( 'DISTINCT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:69:15: 'DISTINCT'
			{
			match("DISTINCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTINCT"

	// $ANTLR start "KW_INSERT"
	public final void mKW_INSERT() throws RecognitionException {
		try {
			int _type = KW_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:70:11: ( 'INSERT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:70:13: 'INSERT'
			{
			match("INSERT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INSERT"

	// $ANTLR start "KW_OVERWRITE"
	public final void mKW_OVERWRITE() throws RecognitionException {
		try {
			int _type = KW_OVERWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:71:14: ( 'OVERWRITE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:71:16: 'OVERWRITE'
			{
			match("OVERWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVERWRITE"

	// $ANTLR start "KW_OUTER"
	public final void mKW_OUTER() throws RecognitionException {
		try {
			int _type = KW_OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:72:10: ( 'OUTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:72:12: 'OUTER'
			{
			match("OUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTER"

	// $ANTLR start "KW_UNIQUEJOIN"
	public final void mKW_UNIQUEJOIN() throws RecognitionException {
		try {
			int _type = KW_UNIQUEJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:73:15: ( 'UNIQUEJOIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:73:17: 'UNIQUEJOIN'
			{
			match("UNIQUEJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUEJOIN"

	// $ANTLR start "KW_PRESERVE"
	public final void mKW_PRESERVE() throws RecognitionException {
		try {
			int _type = KW_PRESERVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:74:13: ( 'PRESERVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:74:15: 'PRESERVE'
			{
			match("PRESERVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRESERVE"

	// $ANTLR start "KW_JOIN"
	public final void mKW_JOIN() throws RecognitionException {
		try {
			int _type = KW_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:75:9: ( 'JOIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:75:11: 'JOIN'
			{
			match("JOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOIN"

	// $ANTLR start "KW_LEFT"
	public final void mKW_LEFT() throws RecognitionException {
		try {
			int _type = KW_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:76:9: ( 'LEFT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:76:11: 'LEFT'
			{
			match("LEFT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEFT"

	// $ANTLR start "KW_RIGHT"
	public final void mKW_RIGHT() throws RecognitionException {
		try {
			int _type = KW_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:77:10: ( 'RIGHT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:77:12: 'RIGHT'
			{
			match("RIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RIGHT"

	// $ANTLR start "KW_FULL"
	public final void mKW_FULL() throws RecognitionException {
		try {
			int _type = KW_FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:78:9: ( 'FULL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:78:11: 'FULL'
			{
			match("FULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FULL"

	// $ANTLR start "KW_ON"
	public final void mKW_ON() throws RecognitionException {
		try {
			int _type = KW_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:79:7: ( 'ON' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:79:9: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ON"

	// $ANTLR start "KW_PARTITION"
	public final void mKW_PARTITION() throws RecognitionException {
		try {
			int _type = KW_PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:80:14: ( 'PARTITION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:80:16: 'PARTITION'
			{
			match("PARTITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITION"

	// $ANTLR start "KW_PARTITIONS"
	public final void mKW_PARTITIONS() throws RecognitionException {
		try {
			int _type = KW_PARTITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:81:15: ( 'PARTITIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:81:17: 'PARTITIONS'
			{
			match("PARTITIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONS"

	// $ANTLR start "KW_TABLE"
	public final void mKW_TABLE() throws RecognitionException {
		try {
			int _type = KW_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:82:9: ( 'TABLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:82:11: 'TABLE'
			{
			match("TABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLE"

	// $ANTLR start "KW_TABLES"
	public final void mKW_TABLES() throws RecognitionException {
		try {
			int _type = KW_TABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:83:10: ( 'TABLES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:83:12: 'TABLES'
			{
			match("TABLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLES"

	// $ANTLR start "KW_COLUMNS"
	public final void mKW_COLUMNS() throws RecognitionException {
		try {
			int _type = KW_COLUMNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:84:11: ( 'COLUMNS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:84:13: 'COLUMNS'
			{
			match("COLUMNS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMNS"

	// $ANTLR start "KW_INDEX"
	public final void mKW_INDEX() throws RecognitionException {
		try {
			int _type = KW_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:85:9: ( 'INDEX' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:85:11: 'INDEX'
			{
			match("INDEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEX"

	// $ANTLR start "KW_INDEXES"
	public final void mKW_INDEXES() throws RecognitionException {
		try {
			int _type = KW_INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:86:11: ( 'INDEXES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:86:13: 'INDEXES'
			{
			match("INDEXES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEXES"

	// $ANTLR start "KW_REBUILD"
	public final void mKW_REBUILD() throws RecognitionException {
		try {
			int _type = KW_REBUILD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:87:11: ( 'REBUILD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:87:13: 'REBUILD'
			{
			match("REBUILD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REBUILD"

	// $ANTLR start "KW_FUNCTIONS"
	public final void mKW_FUNCTIONS() throws RecognitionException {
		try {
			int _type = KW_FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:88:13: ( 'FUNCTIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:88:15: 'FUNCTIONS'
			{
			match("FUNCTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTIONS"

	// $ANTLR start "KW_SHOW"
	public final void mKW_SHOW() throws RecognitionException {
		try {
			int _type = KW_SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:89:8: ( 'SHOW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:89:10: 'SHOW'
			{
			match("SHOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW"

	// $ANTLR start "KW_MSCK"
	public final void mKW_MSCK() throws RecognitionException {
		try {
			int _type = KW_MSCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:90:8: ( 'MSCK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:90:10: 'MSCK'
			{
			match("MSCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MSCK"

	// $ANTLR start "KW_REPAIR"
	public final void mKW_REPAIR() throws RecognitionException {
		try {
			int _type = KW_REPAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:91:10: ( 'REPAIR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:91:12: 'REPAIR'
			{
			match("REPAIR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPAIR"

	// $ANTLR start "KW_DIRECTORY"
	public final void mKW_DIRECTORY() throws RecognitionException {
		try {
			int _type = KW_DIRECTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:92:13: ( 'DIRECTORY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:92:15: 'DIRECTORY'
			{
			match("DIRECTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORY"

	// $ANTLR start "KW_LOCAL"
	public final void mKW_LOCAL() throws RecognitionException {
		try {
			int _type = KW_LOCAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:93:9: ( 'LOCAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:93:11: 'LOCAL'
			{
			match("LOCAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCAL"

	// $ANTLR start "KW_TRANSFORM"
	public final void mKW_TRANSFORM() throws RecognitionException {
		try {
			int _type = KW_TRANSFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:94:14: ( 'TRANSFORM' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:94:16: 'TRANSFORM'
			{
			match("TRANSFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSFORM"

	// $ANTLR start "KW_USING"
	public final void mKW_USING() throws RecognitionException {
		try {
			int _type = KW_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:95:9: ( 'USING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:95:11: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USING"

	// $ANTLR start "KW_CLUSTER"
	public final void mKW_CLUSTER() throws RecognitionException {
		try {
			int _type = KW_CLUSTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:96:11: ( 'CLUSTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:96:13: 'CLUSTER'
			{
			match("CLUSTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTER"

	// $ANTLR start "KW_DISTRIBUTE"
	public final void mKW_DISTRIBUTE() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:97:14: ( 'DISTRIBUTE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:97:16: 'DISTRIBUTE'
			{
			match("DISTRIBUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTE"

	// $ANTLR start "KW_SORT"
	public final void mKW_SORT() throws RecognitionException {
		try {
			int _type = KW_SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:98:8: ( 'SORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:98:10: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORT"

	// $ANTLR start "KW_UNION"
	public final void mKW_UNION() throws RecognitionException {
		try {
			int _type = KW_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:99:9: ( 'UNION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:99:11: 'UNION'
			{
			match("UNION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNION"

	// $ANTLR start "KW_EXCEPT"
	public final void mKW_EXCEPT() throws RecognitionException {
		try {
			int _type = KW_EXCEPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:100:10: ( 'EXCEPT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:100:12: 'EXCEPT'
			{
			match("EXCEPT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCEPT"

	// $ANTLR start "KW_LOAD"
	public final void mKW_LOAD() throws RecognitionException {
		try {
			int _type = KW_LOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:101:8: ( 'LOAD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:101:10: 'LOAD'
			{
			match("LOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOAD"

	// $ANTLR start "KW_EXPORT"
	public final void mKW_EXPORT() throws RecognitionException {
		try {
			int _type = KW_EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:102:10: ( 'EXPORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:102:12: 'EXPORT'
			{
			match("EXPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPORT"

	// $ANTLR start "KW_IMPORT"
	public final void mKW_IMPORT() throws RecognitionException {
		try {
			int _type = KW_IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:103:10: ( 'IMPORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:103:12: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IMPORT"

	// $ANTLR start "KW_REPLICATION"
	public final void mKW_REPLICATION() throws RecognitionException {
		try {
			int _type = KW_REPLICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:104:15: ( 'REPLICATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:104:17: 'REPLICATION'
			{
			match("REPLICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLICATION"

	// $ANTLR start "KW_METADATA"
	public final void mKW_METADATA() throws RecognitionException {
		try {
			int _type = KW_METADATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:105:12: ( 'METADATA' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:105:14: 'METADATA'
			{
			match("METADATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_METADATA"

	// $ANTLR start "KW_DATA"
	public final void mKW_DATA() throws RecognitionException {
		try {
			int _type = KW_DATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:106:8: ( 'DATA' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:106:10: 'DATA'
			{
			match("DATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATA"

	// $ANTLR start "KW_INPATH"
	public final void mKW_INPATH() throws RecognitionException {
		try {
			int _type = KW_INPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:107:10: ( 'INPATH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:107:12: 'INPATH'
			{
			match("INPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPATH"

	// $ANTLR start "KW_IS"
	public final void mKW_IS() throws RecognitionException {
		try {
			int _type = KW_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:108:6: ( 'IS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:108:8: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IS"

	// $ANTLR start "KW_NULL"
	public final void mKW_NULL() throws RecognitionException {
		try {
			int _type = KW_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:109:8: ( 'NULL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:109:10: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULL"

	// $ANTLR start "KW_CREATE"
	public final void mKW_CREATE() throws RecognitionException {
		try {
			int _type = KW_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:110:10: ( 'CREATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:110:12: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CREATE"

	// $ANTLR start "KW_EXTERNAL"
	public final void mKW_EXTERNAL() throws RecognitionException {
		try {
			int _type = KW_EXTERNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:111:12: ( 'EXTERNAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:111:14: 'EXTERNAL'
			{
			match("EXTERNAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTERNAL"

	// $ANTLR start "KW_ALTER"
	public final void mKW_ALTER() throws RecognitionException {
		try {
			int _type = KW_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:112:9: ( 'ALTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:112:11: 'ALTER'
			{
			match("ALTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALTER"

	// $ANTLR start "KW_CHANGE"
	public final void mKW_CHANGE() throws RecognitionException {
		try {
			int _type = KW_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:113:10: ( 'CHANGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:113:12: 'CHANGE'
			{
			match("CHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHANGE"

	// $ANTLR start "KW_COLUMN"
	public final void mKW_COLUMN() throws RecognitionException {
		try {
			int _type = KW_COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:114:10: ( 'COLUMN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:114:12: 'COLUMN'
			{
			match("COLUMN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMN"

	// $ANTLR start "KW_FIRST"
	public final void mKW_FIRST() throws RecognitionException {
		try {
			int _type = KW_FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:115:9: ( 'FIRST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:115:11: 'FIRST'
			{
			match("FIRST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIRST"

	// $ANTLR start "KW_AFTER"
	public final void mKW_AFTER() throws RecognitionException {
		try {
			int _type = KW_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:116:9: ( 'AFTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:116:11: 'AFTER'
			{
			match("AFTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AFTER"

	// $ANTLR start "KW_DESCRIBE"
	public final void mKW_DESCRIBE() throws RecognitionException {
		try {
			int _type = KW_DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:117:12: ( 'DESCRIBE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:117:14: 'DESCRIBE'
			{
			match("DESCRIBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESCRIBE"

	// $ANTLR start "KW_DROP"
	public final void mKW_DROP() throws RecognitionException {
		try {
			int _type = KW_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:118:8: ( 'DROP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:118:10: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DROP"

	// $ANTLR start "KW_RENAME"
	public final void mKW_RENAME() throws RecognitionException {
		try {
			int _type = KW_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:119:10: ( 'RENAME' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:119:12: 'RENAME'
			{
			match("RENAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RENAME"

	// $ANTLR start "KW_TO"
	public final void mKW_TO() throws RecognitionException {
		try {
			int _type = KW_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:120:6: ( 'TO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:120:8: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TO"

	// $ANTLR start "KW_COMMENT"
	public final void mKW_COMMENT() throws RecognitionException {
		try {
			int _type = KW_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:121:11: ( 'COMMENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:121:13: 'COMMENT'
			{
			match("COMMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMENT"

	// $ANTLR start "KW_BOOLEAN"
	public final void mKW_BOOLEAN() throws RecognitionException {
		try {
			int _type = KW_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:122:11: ( 'BOOLEAN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:122:13: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOOLEAN"

	// $ANTLR start "KW_TINYINT"
	public final void mKW_TINYINT() throws RecognitionException {
		try {
			int _type = KW_TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:123:11: ( 'TINYINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:123:13: 'TINYINT'
			{
			match("TINYINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TINYINT"

	// $ANTLR start "KW_SMALLINT"
	public final void mKW_SMALLINT() throws RecognitionException {
		try {
			int _type = KW_SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:124:12: ( 'SMALLINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:124:14: 'SMALLINT'
			{
			match("SMALLINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SMALLINT"

	// $ANTLR start "KW_INT"
	public final void mKW_INT() throws RecognitionException {
		try {
			int _type = KW_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:125:7: ( 'INT' | 'INTEGER' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='I') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='N') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='T') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='E') ) {
							alt2=2;
						}

						else {
							alt2=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:125:9: 'INT'
					{
					match("INT"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:125:17: 'INTEGER'
					{
					match("INTEGER"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INT"

	// $ANTLR start "KW_BIGINT"
	public final void mKW_BIGINT() throws RecognitionException {
		try {
			int _type = KW_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:126:10: ( 'BIGINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:126:12: 'BIGINT'
			{
			match("BIGINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BIGINT"

	// $ANTLR start "KW_FLOAT"
	public final void mKW_FLOAT() throws RecognitionException {
		try {
			int _type = KW_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:127:9: ( 'FLOAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:127:11: 'FLOAT'
			{
			match("FLOAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOAT"

	// $ANTLR start "KW_DOUBLE"
	public final void mKW_DOUBLE() throws RecognitionException {
		try {
			int _type = KW_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:128:10: ( 'DOUBLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:128:12: 'DOUBLE'
			{
			match("DOUBLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOUBLE"

	// $ANTLR start "KW_PRECISION"
	public final void mKW_PRECISION() throws RecognitionException {
		try {
			int _type = KW_PRECISION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:129:13: ( 'PRECISION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:129:15: 'PRECISION'
			{
			match("PRECISION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECISION"

	// $ANTLR start "KW_DATE"
	public final void mKW_DATE() throws RecognitionException {
		try {
			int _type = KW_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:130:8: ( 'DATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:130:10: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATE"

	// $ANTLR start "KW_DATETIME"
	public final void mKW_DATETIME() throws RecognitionException {
		try {
			int _type = KW_DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:131:12: ( 'DATETIME' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:131:14: 'DATETIME'
			{
			match("DATETIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATETIME"

	// $ANTLR start "KW_TIMESTAMP"
	public final void mKW_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:132:13: ( 'TIMESTAMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:132:15: 'TIMESTAMP'
			{
			match("TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMP"

	// $ANTLR start "KW_TIMESTAMPLOCALTZ"
	public final void mKW_TIMESTAMPLOCALTZ() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMPLOCALTZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:133:20: ( 'TIMESTAMPLOCALTZ' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:133:22: 'TIMESTAMPLOCALTZ'
			{
			match("TIMESTAMPLOCALTZ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMPLOCALTZ"

	// $ANTLR start "KW_TIME"
	public final void mKW_TIME() throws RecognitionException {
		try {
			int _type = KW_TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:134:8: ( 'TIME' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:134:10: 'TIME'
			{
			match("TIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIME"

	// $ANTLR start "KW_ZONE"
	public final void mKW_ZONE() throws RecognitionException {
		try {
			int _type = KW_ZONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:135:8: ( 'ZONE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:135:10: 'ZONE'
			{
			match("ZONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ZONE"

	// $ANTLR start "KW_INTERVAL"
	public final void mKW_INTERVAL() throws RecognitionException {
		try {
			int _type = KW_INTERVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:136:12: ( 'INTERVAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:136:14: 'INTERVAL'
			{
			match("INTERVAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERVAL"

	// $ANTLR start "KW_DECIMAL"
	public final void mKW_DECIMAL() throws RecognitionException {
		try {
			int _type = KW_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:11: ( 'DECIMAL' | 'DEC' | 'NUMERIC' )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='D') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='E') ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3=='C') ) {
						int LA3_4 = input.LA(4);
						if ( (LA3_4=='I') ) {
							alt3=1;
						}

						else {
							alt3=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA3_0=='N') ) {
				alt3=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:13: 'DECIMAL'
					{
					match("DECIMAL"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:25: 'DEC'
					{
					match("DEC"); 

					}
					break;
				case 3 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:33: 'NUMERIC'
					{
					match("NUMERIC"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DECIMAL"

	// $ANTLR start "KW_STRING"
	public final void mKW_STRING() throws RecognitionException {
		try {
			int _type = KW_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:10: ( 'STRING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:12: 'STRING'
			{
			match("STRING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRING"

	// $ANTLR start "KW_CHAR"
	public final void mKW_CHAR() throws RecognitionException {
		try {
			int _type = KW_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:139:8: ( 'CHAR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:139:10: 'CHAR'
			{
			match("CHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHAR"

	// $ANTLR start "KW_VARCHAR"
	public final void mKW_VARCHAR() throws RecognitionException {
		try {
			int _type = KW_VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:140:11: ( 'VARCHAR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:140:13: 'VARCHAR'
			{
			match("VARCHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VARCHAR"

	// $ANTLR start "KW_ARRAY"
	public final void mKW_ARRAY() throws RecognitionException {
		try {
			int _type = KW_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:141:9: ( 'ARRAY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:141:11: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARRAY"

	// $ANTLR start "KW_STRUCT"
	public final void mKW_STRUCT() throws RecognitionException {
		try {
			int _type = KW_STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:142:10: ( 'STRUCT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:142:12: 'STRUCT'
			{
			match("STRUCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRUCT"

	// $ANTLR start "KW_MAP"
	public final void mKW_MAP() throws RecognitionException {
		try {
			int _type = KW_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:143:7: ( 'MAP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:143:9: 'MAP'
			{
			match("MAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAP"

	// $ANTLR start "KW_UNIONTYPE"
	public final void mKW_UNIONTYPE() throws RecognitionException {
		try {
			int _type = KW_UNIONTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:144:13: ( 'UNIONTYPE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:144:15: 'UNIONTYPE'
			{
			match("UNIONTYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIONTYPE"

	// $ANTLR start "KW_REDUCE"
	public final void mKW_REDUCE() throws RecognitionException {
		try {
			int _type = KW_REDUCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:145:10: ( 'REDUCE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:145:12: 'REDUCE'
			{
			match("REDUCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REDUCE"

	// $ANTLR start "KW_PARTITIONED"
	public final void mKW_PARTITIONED() throws RecognitionException {
		try {
			int _type = KW_PARTITIONED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:146:15: ( 'PARTITIONED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:146:17: 'PARTITIONED'
			{
			match("PARTITIONED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONED"

	// $ANTLR start "KW_CLUSTERED"
	public final void mKW_CLUSTERED() throws RecognitionException {
		try {
			int _type = KW_CLUSTERED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:147:13: ( 'CLUSTERED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:147:15: 'CLUSTERED'
			{
			match("CLUSTERED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERED"

	// $ANTLR start "KW_DISTRIBUTED"
	public final void mKW_DISTRIBUTED() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:148:15: ( 'DISTRIBUTED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:148:17: 'DISTRIBUTED'
			{
			match("DISTRIBUTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTED"

	// $ANTLR start "KW_SORTED"
	public final void mKW_SORTED() throws RecognitionException {
		try {
			int _type = KW_SORTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:149:10: ( 'SORTED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:149:12: 'SORTED'
			{
			match("SORTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORTED"

	// $ANTLR start "KW_INTO"
	public final void mKW_INTO() throws RecognitionException {
		try {
			int _type = KW_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:150:8: ( 'INTO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:150:10: 'INTO'
			{
			match("INTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTO"

	// $ANTLR start "KW_BUCKETS"
	public final void mKW_BUCKETS() throws RecognitionException {
		try {
			int _type = KW_BUCKETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:151:11: ( 'BUCKETS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:151:13: 'BUCKETS'
			{
			match("BUCKETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKETS"

	// $ANTLR start "KW_ROW"
	public final void mKW_ROW() throws RecognitionException {
		try {
			int _type = KW_ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:152:7: ( 'ROW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:152:9: 'ROW'
			{
			match("ROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROW"

	// $ANTLR start "KW_ROWS"
	public final void mKW_ROWS() throws RecognitionException {
		try {
			int _type = KW_ROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:153:8: ( 'ROWS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:153:10: 'ROWS'
			{
			match("ROWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROWS"

	// $ANTLR start "KW_FORMAT"
	public final void mKW_FORMAT() throws RecognitionException {
		try {
			int _type = KW_FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:154:10: ( 'FORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:154:12: 'FORMAT'
			{
			match("FORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMAT"

	// $ANTLR start "KW_DELIMITED"
	public final void mKW_DELIMITED() throws RecognitionException {
		try {
			int _type = KW_DELIMITED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:155:13: ( 'DELIMITED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:155:15: 'DELIMITED'
			{
			match("DELIMITED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELIMITED"

	// $ANTLR start "KW_FIELDS"
	public final void mKW_FIELDS() throws RecognitionException {
		try {
			int _type = KW_FIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:156:10: ( 'FIELDS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:156:12: 'FIELDS'
			{
			match("FIELDS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIELDS"

	// $ANTLR start "KW_TERMINATED"
	public final void mKW_TERMINATED() throws RecognitionException {
		try {
			int _type = KW_TERMINATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:157:14: ( 'TERMINATED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:157:16: 'TERMINATED'
			{
			match("TERMINATED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TERMINATED"

	// $ANTLR start "KW_ESCAPED"
	public final void mKW_ESCAPED() throws RecognitionException {
		try {
			int _type = KW_ESCAPED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:158:11: ( 'ESCAPED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:158:13: 'ESCAPED'
			{
			match("ESCAPED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ESCAPED"

	// $ANTLR start "KW_COLLECTION"
	public final void mKW_COLLECTION() throws RecognitionException {
		try {
			int _type = KW_COLLECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:159:14: ( 'COLLECTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:159:16: 'COLLECTION'
			{
			match("COLLECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLLECTION"

	// $ANTLR start "KW_ITEMS"
	public final void mKW_ITEMS() throws RecognitionException {
		try {
			int _type = KW_ITEMS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:160:9: ( 'ITEMS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:160:11: 'ITEMS'
			{
			match("ITEMS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ITEMS"

	// $ANTLR start "KW_KEYS"
	public final void mKW_KEYS() throws RecognitionException {
		try {
			int _type = KW_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:161:8: ( 'KEYS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:161:10: 'KEYS'
			{
			match("KEYS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEYS"

	// $ANTLR start "KW_KEY_TYPE"
	public final void mKW_KEY_TYPE() throws RecognitionException {
		try {
			int _type = KW_KEY_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:162:12: ( '$KEY$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:162:14: '$KEY$'
			{
			match("$KEY$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY_TYPE"

	// $ANTLR start "KW_KILL"
	public final void mKW_KILL() throws RecognitionException {
		try {
			int _type = KW_KILL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:163:8: ( 'KILL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:163:10: 'KILL'
			{
			match("KILL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KILL"

	// $ANTLR start "KW_LINES"
	public final void mKW_LINES() throws RecognitionException {
		try {
			int _type = KW_LINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:164:9: ( 'LINES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:164:11: 'LINES'
			{
			match("LINES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LINES"

	// $ANTLR start "KW_STORED"
	public final void mKW_STORED() throws RecognitionException {
		try {
			int _type = KW_STORED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:165:10: ( 'STORED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:165:12: 'STORED'
			{
			match("STORED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STORED"

	// $ANTLR start "KW_FILEFORMAT"
	public final void mKW_FILEFORMAT() throws RecognitionException {
		try {
			int _type = KW_FILEFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:166:14: ( 'FILEFORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:166:16: 'FILEFORMAT'
			{
			match("FILEFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILEFORMAT"

	// $ANTLR start "KW_INPUTFORMAT"
	public final void mKW_INPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_INPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:167:15: ( 'INPUTFORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:167:17: 'INPUTFORMAT'
			{
			match("INPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTFORMAT"

	// $ANTLR start "KW_OUTPUTFORMAT"
	public final void mKW_OUTPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_OUTPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:168:16: ( 'OUTPUTFORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:168:18: 'OUTPUTFORMAT'
			{
			match("OUTPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTFORMAT"

	// $ANTLR start "KW_INPUTDRIVER"
	public final void mKW_INPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_INPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:169:15: ( 'INPUTDRIVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:169:17: 'INPUTDRIVER'
			{
			match("INPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTDRIVER"

	// $ANTLR start "KW_OUTPUTDRIVER"
	public final void mKW_OUTPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_OUTPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:170:16: ( 'OUTPUTDRIVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:170:18: 'OUTPUTDRIVER'
			{
			match("OUTPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTDRIVER"

	// $ANTLR start "KW_ENABLE"
	public final void mKW_ENABLE() throws RecognitionException {
		try {
			int _type = KW_ENABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:171:10: ( 'ENABLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:171:12: 'ENABLE'
			{
			match("ENABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENABLE"

	// $ANTLR start "KW_DISABLE"
	public final void mKW_DISABLE() throws RecognitionException {
		try {
			int _type = KW_DISABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:172:11: ( 'DISABLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:172:13: 'DISABLE'
			{
			match("DISABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISABLE"

	// $ANTLR start "KW_LOCATION"
	public final void mKW_LOCATION() throws RecognitionException {
		try {
			int _type = KW_LOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:173:12: ( 'LOCATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:173:14: 'LOCATION'
			{
			match("LOCATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCATION"

	// $ANTLR start "KW_TABLESAMPLE"
	public final void mKW_TABLESAMPLE() throws RecognitionException {
		try {
			int _type = KW_TABLESAMPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:174:15: ( 'TABLESAMPLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:174:17: 'TABLESAMPLE'
			{
			match("TABLESAMPLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLESAMPLE"

	// $ANTLR start "KW_BUCKET"
	public final void mKW_BUCKET() throws RecognitionException {
		try {
			int _type = KW_BUCKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:175:10: ( 'BUCKET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:175:12: 'BUCKET'
			{
			match("BUCKET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKET"

	// $ANTLR start "KW_OUT"
	public final void mKW_OUT() throws RecognitionException {
		try {
			int _type = KW_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:176:7: ( 'OUT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:176:9: 'OUT'
			{
			match("OUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUT"

	// $ANTLR start "KW_OF"
	public final void mKW_OF() throws RecognitionException {
		try {
			int _type = KW_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:177:6: ( 'OF' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:177:8: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OF"

	// $ANTLR start "KW_PERCENT"
	public final void mKW_PERCENT() throws RecognitionException {
		try {
			int _type = KW_PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:178:11: ( 'PERCENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:178:13: 'PERCENT'
			{
			match("PERCENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PERCENT"

	// $ANTLR start "KW_CAST"
	public final void mKW_CAST() throws RecognitionException {
		try {
			int _type = KW_CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:179:8: ( 'CAST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:179:10: 'CAST'
			{
			match("CAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CAST"

	// $ANTLR start "KW_ADD"
	public final void mKW_ADD() throws RecognitionException {
		try {
			int _type = KW_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:180:7: ( 'ADD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:180:9: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADD"

	// $ANTLR start "KW_REPLACE"
	public final void mKW_REPLACE() throws RecognitionException {
		try {
			int _type = KW_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:181:11: ( 'REPLACE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:181:13: 'REPLACE'
			{
			match("REPLACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLACE"

	// $ANTLR start "KW_RLIKE"
	public final void mKW_RLIKE() throws RecognitionException {
		try {
			int _type = KW_RLIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:182:9: ( 'RLIKE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:182:11: 'RLIKE'
			{
			match("RLIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RLIKE"

	// $ANTLR start "KW_REGEXP"
	public final void mKW_REGEXP() throws RecognitionException {
		try {
			int _type = KW_REGEXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:183:10: ( 'REGEXP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:183:12: 'REGEXP'
			{
			match("REGEXP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REGEXP"

	// $ANTLR start "KW_TEMPORARY"
	public final void mKW_TEMPORARY() throws RecognitionException {
		try {
			int _type = KW_TEMPORARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:184:13: ( 'TEMPORARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:184:15: 'TEMPORARY'
			{
			match("TEMPORARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEMPORARY"

	// $ANTLR start "KW_FUNCTION"
	public final void mKW_FUNCTION() throws RecognitionException {
		try {
			int _type = KW_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:185:12: ( 'FUNCTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:185:14: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTION"

	// $ANTLR start "KW_MACRO"
	public final void mKW_MACRO() throws RecognitionException {
		try {
			int _type = KW_MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:186:9: ( 'MACRO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:186:11: 'MACRO'
			{
			match("MACRO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MACRO"

	// $ANTLR start "KW_FILE"
	public final void mKW_FILE() throws RecognitionException {
		try {
			int _type = KW_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:187:8: ( 'FILE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:187:10: 'FILE'
			{
			match("FILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILE"

	// $ANTLR start "KW_JAR"
	public final void mKW_JAR() throws RecognitionException {
		try {
			int _type = KW_JAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:188:7: ( 'JAR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:188:9: 'JAR'
			{
			match("JAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JAR"

	// $ANTLR start "KW_EXPLAIN"
	public final void mKW_EXPLAIN() throws RecognitionException {
		try {
			int _type = KW_EXPLAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:189:11: ( 'EXPLAIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:189:13: 'EXPLAIN'
			{
			match("EXPLAIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPLAIN"

	// $ANTLR start "KW_EXTENDED"
	public final void mKW_EXTENDED() throws RecognitionException {
		try {
			int _type = KW_EXTENDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:190:12: ( 'EXTENDED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:190:14: 'EXTENDED'
			{
			match("EXTENDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTENDED"

	// $ANTLR start "KW_DEBUG"
	public final void mKW_DEBUG() throws RecognitionException {
		try {
			int _type = KW_DEBUG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:191:9: ( 'DEBUG' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:191:11: 'DEBUG'
			{
			match("DEBUG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEBUG"

	// $ANTLR start "KW_FORMATTED"
	public final void mKW_FORMATTED() throws RecognitionException {
		try {
			int _type = KW_FORMATTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:192:13: ( 'FORMATTED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:192:15: 'FORMATTED'
			{
			match("FORMATTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMATTED"

	// $ANTLR start "KW_DEPENDENCY"
	public final void mKW_DEPENDENCY() throws RecognitionException {
		try {
			int _type = KW_DEPENDENCY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:193:14: ( 'DEPENDENCY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:193:16: 'DEPENDENCY'
			{
			match("DEPENDENCY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEPENDENCY"

	// $ANTLR start "KW_LOGICAL"
	public final void mKW_LOGICAL() throws RecognitionException {
		try {
			int _type = KW_LOGICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:194:11: ( 'LOGICAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:194:13: 'LOGICAL'
			{
			match("LOGICAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOGICAL"

	// $ANTLR start "KW_CBO"
	public final void mKW_CBO() throws RecognitionException {
		try {
			int _type = KW_CBO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:195:7: ( 'CBO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:195:9: 'CBO'
			{
			match("CBO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CBO"

	// $ANTLR start "KW_SERDE"
	public final void mKW_SERDE() throws RecognitionException {
		try {
			int _type = KW_SERDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:196:9: ( 'SERDE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:196:11: 'SERDE'
			{
			match("SERDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDE"

	// $ANTLR start "KW_WITH"
	public final void mKW_WITH() throws RecognitionException {
		try {
			int _type = KW_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:197:8: ( 'WITH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:197:10: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WITH"

	// $ANTLR start "KW_DEFERRED"
	public final void mKW_DEFERRED() throws RecognitionException {
		try {
			int _type = KW_DEFERRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:198:12: ( 'DEFERRED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:198:14: 'DEFERRED'
			{
			match("DEFERRED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFERRED"

	// $ANTLR start "KW_SERDEPROPERTIES"
	public final void mKW_SERDEPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_SERDEPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:199:19: ( 'SERDEPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:199:21: 'SERDEPROPERTIES'
			{
			match("SERDEPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDEPROPERTIES"

	// $ANTLR start "KW_DBPROPERTIES"
	public final void mKW_DBPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_DBPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:200:16: ( 'DBPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:200:18: 'DBPROPERTIES'
			{
			match("DBPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DBPROPERTIES"

	// $ANTLR start "KW_LIMIT"
	public final void mKW_LIMIT() throws RecognitionException {
		try {
			int _type = KW_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:201:9: ( 'LIMIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:201:11: 'LIMIT'
			{
			match("LIMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIMIT"

	// $ANTLR start "KW_OFFSET"
	public final void mKW_OFFSET() throws RecognitionException {
		try {
			int _type = KW_OFFSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:202:10: ( 'OFFSET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:202:12: 'OFFSET'
			{
			match("OFFSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OFFSET"

	// $ANTLR start "KW_SET"
	public final void mKW_SET() throws RecognitionException {
		try {
			int _type = KW_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:203:7: ( 'SET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:203:9: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SET"

	// $ANTLR start "KW_UNSET"
	public final void mKW_UNSET() throws RecognitionException {
		try {
			int _type = KW_UNSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:204:9: ( 'UNSET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:204:11: 'UNSET'
			{
			match("UNSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSET"

	// $ANTLR start "KW_TBLPROPERTIES"
	public final void mKW_TBLPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_TBLPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:205:17: ( 'TBLPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:205:19: 'TBLPROPERTIES'
			{
			match("TBLPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TBLPROPERTIES"

	// $ANTLR start "KW_IDXPROPERTIES"
	public final void mKW_IDXPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_IDXPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:206:17: ( 'IDXPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:206:19: 'IDXPROPERTIES'
			{
			match("IDXPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IDXPROPERTIES"

	// $ANTLR start "KW_VALUE_TYPE"
	public final void mKW_VALUE_TYPE() throws RecognitionException {
		try {
			int _type = KW_VALUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:207:14: ( '$VALUE$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:207:16: '$VALUE$'
			{
			match("$VALUE$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUE_TYPE"

	// $ANTLR start "KW_ELEM_TYPE"
	public final void mKW_ELEM_TYPE() throws RecognitionException {
		try {
			int _type = KW_ELEM_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:208:13: ( '$ELEM$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:208:15: '$ELEM$'
			{
			match("$ELEM$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELEM_TYPE"

	// $ANTLR start "KW_DEFINED"
	public final void mKW_DEFINED() throws RecognitionException {
		try {
			int _type = KW_DEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:209:11: ( 'DEFINED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:209:13: 'DEFINED'
			{
			match("DEFINED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFINED"

	// $ANTLR start "KW_CASE"
	public final void mKW_CASE() throws RecognitionException {
		try {
			int _type = KW_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:210:8: ( 'CASE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:210:10: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASE"

	// $ANTLR start "KW_WHEN"
	public final void mKW_WHEN() throws RecognitionException {
		try {
			int _type = KW_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:211:8: ( 'WHEN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:211:10: 'WHEN'
			{
			match("WHEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHEN"

	// $ANTLR start "KW_THEN"
	public final void mKW_THEN() throws RecognitionException {
		try {
			int _type = KW_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:212:8: ( 'THEN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:212:10: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_THEN"

	// $ANTLR start "KW_ELSE"
	public final void mKW_ELSE() throws RecognitionException {
		try {
			int _type = KW_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:213:8: ( 'ELSE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:213:10: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELSE"

	// $ANTLR start "KW_END"
	public final void mKW_END() throws RecognitionException {
		try {
			int _type = KW_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:214:7: ( 'END' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:214:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_END"

	// $ANTLR start "KW_MAPJOIN"
	public final void mKW_MAPJOIN() throws RecognitionException {
		try {
			int _type = KW_MAPJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:215:11: ( 'MAPJOIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:215:13: 'MAPJOIN'
			{
			match("MAPJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPJOIN"

	// $ANTLR start "KW_STREAMTABLE"
	public final void mKW_STREAMTABLE() throws RecognitionException {
		try {
			int _type = KW_STREAMTABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:216:15: ( 'STREAMTABLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:216:17: 'STREAMTABLE'
			{
			match("STREAMTABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STREAMTABLE"

	// $ANTLR start "KW_CLUSTERSTATUS"
	public final void mKW_CLUSTERSTATUS() throws RecognitionException {
		try {
			int _type = KW_CLUSTERSTATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:217:17: ( 'CLUSTERSTATUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:217:19: 'CLUSTERSTATUS'
			{
			match("CLUSTERSTATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERSTATUS"

	// $ANTLR start "KW_UTC"
	public final void mKW_UTC() throws RecognitionException {
		try {
			int _type = KW_UTC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:218:7: ( 'UTC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:218:9: 'UTC'
			{
			match("UTC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTC"

	// $ANTLR start "KW_UTCTIMESTAMP"
	public final void mKW_UTCTIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_UTCTIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:219:16: ( 'UTC_TMESTAMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:219:18: 'UTC_TMESTAMP'
			{
			match("UTC_TMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTCTIMESTAMP"

	// $ANTLR start "KW_LONG"
	public final void mKW_LONG() throws RecognitionException {
		try {
			int _type = KW_LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:220:8: ( 'LONG' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:220:10: 'LONG'
			{
			match("LONG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LONG"

	// $ANTLR start "KW_DELETE"
	public final void mKW_DELETE() throws RecognitionException {
		try {
			int _type = KW_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:221:10: ( 'DELETE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:221:12: 'DELETE'
			{
			match("DELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELETE"

	// $ANTLR start "KW_PLUS"
	public final void mKW_PLUS() throws RecognitionException {
		try {
			int _type = KW_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:222:8: ( 'PLUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:222:10: 'PLUS'
			{
			match("PLUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLUS"

	// $ANTLR start "KW_MINUS"
	public final void mKW_MINUS() throws RecognitionException {
		try {
			int _type = KW_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:223:9: ( 'MINUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:223:11: 'MINUS'
			{
			match("MINUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUS"

	// $ANTLR start "KW_FETCH"
	public final void mKW_FETCH() throws RecognitionException {
		try {
			int _type = KW_FETCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:224:9: ( 'FETCH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:224:11: 'FETCH'
			{
			match("FETCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FETCH"

	// $ANTLR start "KW_INTERSECT"
	public final void mKW_INTERSECT() throws RecognitionException {
		try {
			int _type = KW_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:225:13: ( 'INTERSECT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:225:15: 'INTERSECT'
			{
			match("INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERSECT"

	// $ANTLR start "KW_VIEW"
	public final void mKW_VIEW() throws RecognitionException {
		try {
			int _type = KW_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:226:8: ( 'VIEW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:226:10: 'VIEW'
			{
			match("VIEW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEW"

	// $ANTLR start "KW_VIEWS"
	public final void mKW_VIEWS() throws RecognitionException {
		try {
			int _type = KW_VIEWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:227:9: ( 'VIEWS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:227:11: 'VIEWS'
			{
			match("VIEWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEWS"

	// $ANTLR start "KW_IN"
	public final void mKW_IN() throws RecognitionException {
		try {
			int _type = KW_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:228:6: ( 'IN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:228:8: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IN"

	// $ANTLR start "KW_DATABASE"
	public final void mKW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:229:12: ( 'DATABASE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:229:14: 'DATABASE'
			{
			match("DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASE"

	// $ANTLR start "KW_DATABASES"
	public final void mKW_DATABASES() throws RecognitionException {
		try {
			int _type = KW_DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:230:13: ( 'DATABASES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:230:15: 'DATABASES'
			{
			match("DATABASES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASES"

	// $ANTLR start "KW_MATERIALIZED"
	public final void mKW_MATERIALIZED() throws RecognitionException {
		try {
			int _type = KW_MATERIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:231:16: ( 'MATERIALIZED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:231:18: 'MATERIALIZED'
			{
			match("MATERIALIZED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATERIALIZED"

	// $ANTLR start "KW_SCHEMA"
	public final void mKW_SCHEMA() throws RecognitionException {
		try {
			int _type = KW_SCHEMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:232:10: ( 'SCHEMA' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:232:12: 'SCHEMA'
			{
			match("SCHEMA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMA"

	// $ANTLR start "KW_SCHEMAS"
	public final void mKW_SCHEMAS() throws RecognitionException {
		try {
			int _type = KW_SCHEMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:233:11: ( 'SCHEMAS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:233:13: 'SCHEMAS'
			{
			match("SCHEMAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMAS"

	// $ANTLR start "KW_GRANT"
	public final void mKW_GRANT() throws RecognitionException {
		try {
			int _type = KW_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:234:9: ( 'GRANT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:234:11: 'GRANT'
			{
			match("GRANT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GRANT"

	// $ANTLR start "KW_REVOKE"
	public final void mKW_REVOKE() throws RecognitionException {
		try {
			int _type = KW_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:235:10: ( 'REVOKE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:235:12: 'REVOKE'
			{
			match("REVOKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REVOKE"

	// $ANTLR start "KW_SSL"
	public final void mKW_SSL() throws RecognitionException {
		try {
			int _type = KW_SSL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:236:7: ( 'SSL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:236:9: 'SSL'
			{
			match("SSL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SSL"

	// $ANTLR start "KW_UNDO"
	public final void mKW_UNDO() throws RecognitionException {
		try {
			int _type = KW_UNDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:237:8: ( 'UNDO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:237:10: 'UNDO'
			{
			match("UNDO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNDO"

	// $ANTLR start "KW_LOCK"
	public final void mKW_LOCK() throws RecognitionException {
		try {
			int _type = KW_LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:238:8: ( 'LOCK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:238:10: 'LOCK'
			{
			match("LOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCK"

	// $ANTLR start "KW_LOCKS"
	public final void mKW_LOCKS() throws RecognitionException {
		try {
			int _type = KW_LOCKS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:239:9: ( 'LOCKS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:239:11: 'LOCKS'
			{
			match("LOCKS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCKS"

	// $ANTLR start "KW_UNLOCK"
	public final void mKW_UNLOCK() throws RecognitionException {
		try {
			int _type = KW_UNLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:240:10: ( 'UNLOCK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:240:12: 'UNLOCK'
			{
			match("UNLOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNLOCK"

	// $ANTLR start "KW_SHARED"
	public final void mKW_SHARED() throws RecognitionException {
		try {
			int _type = KW_SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:241:10: ( 'SHARED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:241:12: 'SHARED'
			{
			match("SHARED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHARED"

	// $ANTLR start "KW_EXCLUSIVE"
	public final void mKW_EXCLUSIVE() throws RecognitionException {
		try {
			int _type = KW_EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:242:13: ( 'EXCLUSIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:242:15: 'EXCLUSIVE'
			{
			match("EXCLUSIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCLUSIVE"

	// $ANTLR start "KW_PROCEDURE"
	public final void mKW_PROCEDURE() throws RecognitionException {
		try {
			int _type = KW_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:243:13: ( 'PROCEDURE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:243:15: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PROCEDURE"

	// $ANTLR start "KW_UNSIGNED"
	public final void mKW_UNSIGNED() throws RecognitionException {
		try {
			int _type = KW_UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:244:12: ( 'UNSIGNED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:244:14: 'UNSIGNED'
			{
			match("UNSIGNED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSIGNED"

	// $ANTLR start "KW_WHILE"
	public final void mKW_WHILE() throws RecognitionException {
		try {
			int _type = KW_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:245:9: ( 'WHILE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:245:11: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHILE"

	// $ANTLR start "KW_READ"
	public final void mKW_READ() throws RecognitionException {
		try {
			int _type = KW_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:246:8: ( 'READ' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:246:10: 'READ'
			{
			match("READ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READ"

	// $ANTLR start "KW_READS"
	public final void mKW_READS() throws RecognitionException {
		try {
			int _type = KW_READS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:247:9: ( 'READS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:247:11: 'READS'
			{
			match("READS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READS"

	// $ANTLR start "KW_PURGE"
	public final void mKW_PURGE() throws RecognitionException {
		try {
			int _type = KW_PURGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:248:9: ( 'PURGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:248:11: 'PURGE'
			{
			match("PURGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PURGE"

	// $ANTLR start "KW_RANGE"
	public final void mKW_RANGE() throws RecognitionException {
		try {
			int _type = KW_RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:249:9: ( 'RANGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:249:11: 'RANGE'
			{
			match("RANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RANGE"

	// $ANTLR start "KW_ANALYZE"
	public final void mKW_ANALYZE() throws RecognitionException {
		try {
			int _type = KW_ANALYZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:250:11: ( 'ANALYZE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:250:13: 'ANALYZE'
			{
			match("ANALYZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANALYZE"

	// $ANTLR start "KW_BEFORE"
	public final void mKW_BEFORE() throws RecognitionException {
		try {
			int _type = KW_BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:251:10: ( 'BEFORE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:251:12: 'BEFORE'
			{
			match("BEFORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BEFORE"

	// $ANTLR start "KW_BETWEEN"
	public final void mKW_BETWEEN() throws RecognitionException {
		try {
			int _type = KW_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:252:11: ( 'BETWEEN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:252:13: 'BETWEEN'
			{
			match("BETWEEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BETWEEN"

	// $ANTLR start "KW_BOTH"
	public final void mKW_BOTH() throws RecognitionException {
		try {
			int _type = KW_BOTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:253:8: ( 'BOTH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:253:10: 'BOTH'
			{
			match("BOTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOTH"

	// $ANTLR start "KW_BINARY"
	public final void mKW_BINARY() throws RecognitionException {
		try {
			int _type = KW_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:254:10: ( 'BINARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:254:12: 'BINARY'
			{
			match("BINARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BINARY"

	// $ANTLR start "KW_CROSS"
	public final void mKW_CROSS() throws RecognitionException {
		try {
			int _type = KW_CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:255:9: ( 'CROSS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:255:11: 'CROSS'
			{
			match("CROSS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CROSS"

	// $ANTLR start "KW_CONTINUE"
	public final void mKW_CONTINUE() throws RecognitionException {
		try {
			int _type = KW_CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:256:12: ( 'CONTINUE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:256:14: 'CONTINUE'
			{
			match("CONTINUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONTINUE"

	// $ANTLR start "KW_CURSOR"
	public final void mKW_CURSOR() throws RecognitionException {
		try {
			int _type = KW_CURSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:257:10: ( 'CURSOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:257:12: 'CURSOR'
			{
			match("CURSOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURSOR"

	// $ANTLR start "KW_TRIGGER"
	public final void mKW_TRIGGER() throws RecognitionException {
		try {
			int _type = KW_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:258:11: ( 'TRIGGER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:258:13: 'TRIGGER'
			{
			match("TRIGGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRIGGER"

	// $ANTLR start "KW_RECORDREADER"
	public final void mKW_RECORDREADER() throws RecognitionException {
		try {
			int _type = KW_RECORDREADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:259:16: ( 'RECORDREADER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:259:18: 'RECORDREADER'
			{
			match("RECORDREADER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDREADER"

	// $ANTLR start "KW_RECORDWRITER"
	public final void mKW_RECORDWRITER() throws RecognitionException {
		try {
			int _type = KW_RECORDWRITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:260:16: ( 'RECORDWRITER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:260:18: 'RECORDWRITER'
			{
			match("RECORDWRITER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDWRITER"

	// $ANTLR start "KW_SEMI"
	public final void mKW_SEMI() throws RecognitionException {
		try {
			int _type = KW_SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:261:8: ( 'SEMI' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:261:10: 'SEMI'
			{
			match("SEMI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEMI"

	// $ANTLR start "KW_LATERAL"
	public final void mKW_LATERAL() throws RecognitionException {
		try {
			int _type = KW_LATERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:262:11: ( 'LATERAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:262:13: 'LATERAL'
			{
			match("LATERAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LATERAL"

	// $ANTLR start "KW_TOUCH"
	public final void mKW_TOUCH() throws RecognitionException {
		try {
			int _type = KW_TOUCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:263:9: ( 'TOUCH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:263:11: 'TOUCH'
			{
			match("TOUCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TOUCH"

	// $ANTLR start "KW_ARCHIVE"
	public final void mKW_ARCHIVE() throws RecognitionException {
		try {
			int _type = KW_ARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:264:11: ( 'ARCHIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:264:13: 'ARCHIVE'
			{
			match("ARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARCHIVE"

	// $ANTLR start "KW_UNARCHIVE"
	public final void mKW_UNARCHIVE() throws RecognitionException {
		try {
			int _type = KW_UNARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:265:13: ( 'UNARCHIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:265:15: 'UNARCHIVE'
			{
			match("UNARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNARCHIVE"

	// $ANTLR start "KW_COMPUTE"
	public final void mKW_COMPUTE() throws RecognitionException {
		try {
			int _type = KW_COMPUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:266:11: ( 'COMPUTE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:266:13: 'COMPUTE'
			{
			match("COMPUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPUTE"

	// $ANTLR start "KW_STATISTICS"
	public final void mKW_STATISTICS() throws RecognitionException {
		try {
			int _type = KW_STATISTICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:267:14: ( 'STATISTICS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:267:16: 'STATISTICS'
			{
			match("STATISTICS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATISTICS"

	// $ANTLR start "KW_USE"
	public final void mKW_USE() throws RecognitionException {
		try {
			int _type = KW_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:268:7: ( 'USE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:268:9: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USE"

	// $ANTLR start "KW_OPTION"
	public final void mKW_OPTION() throws RecognitionException {
		try {
			int _type = KW_OPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:269:10: ( 'OPTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:269:12: 'OPTION'
			{
			match("OPTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPTION"

	// $ANTLR start "KW_CONCATENATE"
	public final void mKW_CONCATENATE() throws RecognitionException {
		try {
			int _type = KW_CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:270:15: ( 'CONCATENATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:270:17: 'CONCATENATE'
			{
			match("CONCATENATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONCATENATE"

	// $ANTLR start "KW_SHOW_DATABASE"
	public final void mKW_SHOW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_SHOW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:271:17: ( 'SHOW_DATABASE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:271:19: 'SHOW_DATABASE'
			{
			match("SHOW_DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW_DATABASE"

	// $ANTLR start "KW_UPDATE"
	public final void mKW_UPDATE() throws RecognitionException {
		try {
			int _type = KW_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:272:10: ( 'UPDATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:272:12: 'UPDATE'
			{
			match("UPDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UPDATE"

	// $ANTLR start "KW_RESTRICT"
	public final void mKW_RESTRICT() throws RecognitionException {
		try {
			int _type = KW_RESTRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:273:12: ( 'RESTRICT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:273:14: 'RESTRICT'
			{
			match("RESTRICT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESTRICT"

	// $ANTLR start "KW_CASCADE"
	public final void mKW_CASCADE() throws RecognitionException {
		try {
			int _type = KW_CASCADE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:274:11: ( 'CASCADE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:274:13: 'CASCADE'
			{
			match("CASCADE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASCADE"

	// $ANTLR start "KW_SKEWED"
	public final void mKW_SKEWED() throws RecognitionException {
		try {
			int _type = KW_SKEWED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:275:10: ( 'SKEWED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:275:12: 'SKEWED'
			{
			match("SKEWED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SKEWED"

	// $ANTLR start "KW_ROLLUP"
	public final void mKW_ROLLUP() throws RecognitionException {
		try {
			int _type = KW_ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:276:10: ( 'ROLLUP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:276:12: 'ROLLUP'
			{
			match("ROLLUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLUP"

	// $ANTLR start "KW_CUBE"
	public final void mKW_CUBE() throws RecognitionException {
		try {
			int _type = KW_CUBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:277:8: ( 'CUBE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:277:10: 'CUBE'
			{
			match("CUBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CUBE"

	// $ANTLR start "KW_DIRECTORIES"
	public final void mKW_DIRECTORIES() throws RecognitionException {
		try {
			int _type = KW_DIRECTORIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:278:15: ( 'DIRECTORIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:278:17: 'DIRECTORIES'
			{
			match("DIRECTORIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORIES"

	// $ANTLR start "KW_FOR"
	public final void mKW_FOR() throws RecognitionException {
		try {
			int _type = KW_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:279:7: ( 'FOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:279:9: 'FOR'
			{
			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOR"

	// $ANTLR start "KW_WINDOW"
	public final void mKW_WINDOW() throws RecognitionException {
		try {
			int _type = KW_WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:280:10: ( 'WINDOW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:280:12: 'WINDOW'
			{
			match("WINDOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WINDOW"

	// $ANTLR start "KW_UNBOUNDED"
	public final void mKW_UNBOUNDED() throws RecognitionException {
		try {
			int _type = KW_UNBOUNDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:281:13: ( 'UNBOUNDED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:281:15: 'UNBOUNDED'
			{
			match("UNBOUNDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNBOUNDED"

	// $ANTLR start "KW_PRECEDING"
	public final void mKW_PRECEDING() throws RecognitionException {
		try {
			int _type = KW_PRECEDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:282:13: ( 'PRECEDING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:282:15: 'PRECEDING'
			{
			match("PRECEDING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECEDING"

	// $ANTLR start "KW_FOLLOWING"
	public final void mKW_FOLLOWING() throws RecognitionException {
		try {
			int _type = KW_FOLLOWING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:283:13: ( 'FOLLOWING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:283:15: 'FOLLOWING'
			{
			match("FOLLOWING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOLLOWING"

	// $ANTLR start "KW_CURRENT"
	public final void mKW_CURRENT() throws RecognitionException {
		try {
			int _type = KW_CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:284:11: ( 'CURRENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:284:13: 'CURRENT'
			{
			match("CURRENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT"

	// $ANTLR start "KW_CURRENT_DATE"
	public final void mKW_CURRENT_DATE() throws RecognitionException {
		try {
			int _type = KW_CURRENT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:285:16: ( 'CURRENT_DATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:285:18: 'CURRENT_DATE'
			{
			match("CURRENT_DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_DATE"

	// $ANTLR start "KW_CURRENT_TIMESTAMP"
	public final void mKW_CURRENT_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_CURRENT_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:286:21: ( 'CURRENT_TIMESTAMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:286:23: 'CURRENT_TIMESTAMP'
			{
			match("CURRENT_TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_TIMESTAMP"

	// $ANTLR start "KW_LESS"
	public final void mKW_LESS() throws RecognitionException {
		try {
			int _type = KW_LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:287:8: ( 'LESS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:287:10: 'LESS'
			{
			match("LESS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LESS"

	// $ANTLR start "KW_MORE"
	public final void mKW_MORE() throws RecognitionException {
		try {
			int _type = KW_MORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:288:8: ( 'MORE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:288:10: 'MORE'
			{
			match("MORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MORE"

	// $ANTLR start "KW_OVER"
	public final void mKW_OVER() throws RecognitionException {
		try {
			int _type = KW_OVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:289:8: ( 'OVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:289:10: 'OVER'
			{
			match("OVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVER"

	// $ANTLR start "KW_GROUPING"
	public final void mKW_GROUPING() throws RecognitionException {
		try {
			int _type = KW_GROUPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:290:12: ( 'GROUPING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:290:14: 'GROUPING'
			{
			match("GROUPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUPING"

	// $ANTLR start "KW_SETS"
	public final void mKW_SETS() throws RecognitionException {
		try {
			int _type = KW_SETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:291:8: ( 'SETS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:291:10: 'SETS'
			{
			match("SETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SETS"

	// $ANTLR start "KW_TRUNCATE"
	public final void mKW_TRUNCATE() throws RecognitionException {
		try {
			int _type = KW_TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:292:12: ( 'TRUNCATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:292:14: 'TRUNCATE'
			{
			match("TRUNCATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUNCATE"

	// $ANTLR start "KW_NOSCAN"
	public final void mKW_NOSCAN() throws RecognitionException {
		try {
			int _type = KW_NOSCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:293:10: ( 'NOSCAN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:293:12: 'NOSCAN'
			{
			match("NOSCAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOSCAN"

	// $ANTLR start "KW_USER"
	public final void mKW_USER() throws RecognitionException {
		try {
			int _type = KW_USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:294:8: ( 'USER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:294:10: 'USER'
			{
			match("USER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USER"

	// $ANTLR start "KW_ROLE"
	public final void mKW_ROLE() throws RecognitionException {
		try {
			int _type = KW_ROLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:295:8: ( 'ROLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:295:10: 'ROLE'
			{
			match("ROLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLE"

	// $ANTLR start "KW_ROLES"
	public final void mKW_ROLES() throws RecognitionException {
		try {
			int _type = KW_ROLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:296:9: ( 'ROLES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:296:11: 'ROLES'
			{
			match("ROLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLES"

	// $ANTLR start "KW_INNER"
	public final void mKW_INNER() throws RecognitionException {
		try {
			int _type = KW_INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:297:9: ( 'INNER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:297:11: 'INNER'
			{
			match("INNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INNER"

	// $ANTLR start "KW_EXCHANGE"
	public final void mKW_EXCHANGE() throws RecognitionException {
		try {
			int _type = KW_EXCHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:298:12: ( 'EXCHANGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:298:14: 'EXCHANGE'
			{
			match("EXCHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCHANGE"

	// $ANTLR start "KW_URI"
	public final void mKW_URI() throws RecognitionException {
		try {
			int _type = KW_URI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:299:7: ( 'URI' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:299:9: 'URI'
			{
			match("URI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_URI"

	// $ANTLR start "KW_SERVER"
	public final void mKW_SERVER() throws RecognitionException {
		try {
			int _type = KW_SERVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:300:11: ( 'SERVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:300:13: 'SERVER'
			{
			match("SERVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERVER"

	// $ANTLR start "KW_ADMIN"
	public final void mKW_ADMIN() throws RecognitionException {
		try {
			int _type = KW_ADMIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:301:9: ( 'ADMIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:301:11: 'ADMIN'
			{
			match("ADMIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADMIN"

	// $ANTLR start "KW_OWNER"
	public final void mKW_OWNER() throws RecognitionException {
		try {
			int _type = KW_OWNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:302:9: ( 'OWNER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:302:11: 'OWNER'
			{
			match("OWNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OWNER"

	// $ANTLR start "KW_PRINCIPALS"
	public final void mKW_PRINCIPALS() throws RecognitionException {
		try {
			int _type = KW_PRINCIPALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:303:14: ( 'PRINCIPALS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:303:16: 'PRINCIPALS'
			{
			match("PRINCIPALS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRINCIPALS"

	// $ANTLR start "KW_COMPACT"
	public final void mKW_COMPACT() throws RecognitionException {
		try {
			int _type = KW_COMPACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:304:11: ( 'COMPACT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:304:13: 'COMPACT'
			{
			match("COMPACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACT"

	// $ANTLR start "KW_COMPACTIONS"
	public final void mKW_COMPACTIONS() throws RecognitionException {
		try {
			int _type = KW_COMPACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:305:15: ( 'COMPACTIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:305:17: 'COMPACTIONS'
			{
			match("COMPACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACTIONS"

	// $ANTLR start "KW_TRANSACTIONS"
	public final void mKW_TRANSACTIONS() throws RecognitionException {
		try {
			int _type = KW_TRANSACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:306:16: ( 'TRANSACTIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:306:18: 'TRANSACTIONS'
			{
			match("TRANSACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTIONS"

	// $ANTLR start "KW_TRANSACTIONAL"
	public final void mKW_TRANSACTIONAL() throws RecognitionException {
		try {
			int _type = KW_TRANSACTIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:307:17: ( 'TRANSACTIONAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:307:19: 'TRANSACTIONAL'
			{
			match("TRANSACTIONAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTIONAL"

	// $ANTLR start "KW_REWRITE"
	public final void mKW_REWRITE() throws RecognitionException {
		try {
			int _type = KW_REWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:308:12: ( 'REWRITE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:308:14: 'REWRITE'
			{
			match("REWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REWRITE"

	// $ANTLR start "KW_AUTHORIZATION"
	public final void mKW_AUTHORIZATION() throws RecognitionException {
		try {
			int _type = KW_AUTHORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:309:17: ( 'AUTHORIZATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:309:19: 'AUTHORIZATION'
			{
			match("AUTHORIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTHORIZATION"

	// $ANTLR start "KW_REOPTIMIZATION"
	public final void mKW_REOPTIMIZATION() throws RecognitionException {
		try {
			int _type = KW_REOPTIMIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:310:18: ( 'REOPTIMIZATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:310:20: 'REOPTIMIZATION'
			{
			match("REOPTIMIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REOPTIMIZATION"

	// $ANTLR start "KW_CONF"
	public final void mKW_CONF() throws RecognitionException {
		try {
			int _type = KW_CONF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:311:8: ( 'CONF' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:311:10: 'CONF'
			{
			match("CONF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONF"

	// $ANTLR start "KW_VALUES"
	public final void mKW_VALUES() throws RecognitionException {
		try {
			int _type = KW_VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:312:10: ( 'VALUES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:312:12: 'VALUES'
			{
			match("VALUES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUES"

	// $ANTLR start "KW_RELOAD"
	public final void mKW_RELOAD() throws RecognitionException {
		try {
			int _type = KW_RELOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:313:10: ( 'RELOAD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:313:12: 'RELOAD'
			{
			match("RELOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELOAD"

	// $ANTLR start "KW_YEAR"
	public final void mKW_YEAR() throws RecognitionException {
		try {
			int _type = KW_YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:314:8: ( 'YEAR' | 'YEARS' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='Y') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='E') ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2=='A') ) {
						int LA4_3 = input.LA(4);
						if ( (LA4_3=='R') ) {
							int LA4_4 = input.LA(5);
							if ( (LA4_4=='S') ) {
								alt4=2;
							}

							else {
								alt4=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:314:10: 'YEAR'
					{
					match("YEAR"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:314:19: 'YEARS'
					{
					match("YEARS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_YEAR"

	// $ANTLR start "KW_QUERY"
	public final void mKW_QUERY() throws RecognitionException {
		try {
			int _type = KW_QUERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:315:9: ( 'QUERY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:315:11: 'QUERY'
			{
			match("QUERY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUERY"

	// $ANTLR start "KW_QUARTER"
	public final void mKW_QUARTER() throws RecognitionException {
		try {
			int _type = KW_QUARTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:316:11: ( 'QUARTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:316:13: 'QUARTER'
			{
			match("QUARTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUARTER"

	// $ANTLR start "KW_MONTH"
	public final void mKW_MONTH() throws RecognitionException {
		try {
			int _type = KW_MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:317:9: ( 'MONTH' | 'MONTHS' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='M') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='O') ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2=='N') ) {
						int LA5_3 = input.LA(4);
						if ( (LA5_3=='T') ) {
							int LA5_4 = input.LA(5);
							if ( (LA5_4=='H') ) {
								int LA5_5 = input.LA(6);
								if ( (LA5_5=='S') ) {
									alt5=2;
								}

								else {
									alt5=1;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:317:11: 'MONTH'
					{
					match("MONTH"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:317:21: 'MONTHS'
					{
					match("MONTHS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MONTH"

	// $ANTLR start "KW_WEEK"
	public final void mKW_WEEK() throws RecognitionException {
		try {
			int _type = KW_WEEK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:8: ( 'WEEK' | 'WEEKS' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='W') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='E') ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2=='E') ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3=='K') ) {
							int LA6_4 = input.LA(5);
							if ( (LA6_4=='S') ) {
								alt6=2;
							}

							else {
								alt6=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:10: 'WEEK'
					{
					match("WEEK"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:19: 'WEEKS'
					{
					match("WEEKS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WEEK"

	// $ANTLR start "KW_DAY"
	public final void mKW_DAY() throws RecognitionException {
		try {
			int _type = KW_DAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:319:7: ( 'DAY' | 'DAYS' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='D') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='A') ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2=='Y') ) {
						int LA7_3 = input.LA(4);
						if ( (LA7_3=='S') ) {
							alt7=2;
						}

						else {
							alt7=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:319:9: 'DAY'
					{
					match("DAY"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:319:17: 'DAYS'
					{
					match("DAYS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DAY"

	// $ANTLR start "KW_DOW"
	public final void mKW_DOW() throws RecognitionException {
		try {
			int _type = KW_DOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:320:7: ( 'DAYOFWEEK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:320:9: 'DAYOFWEEK'
			{
			match("DAYOFWEEK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOW"

	// $ANTLR start "KW_HOUR"
	public final void mKW_HOUR() throws RecognitionException {
		try {
			int _type = KW_HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:8: ( 'HOUR' | 'HOURS' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='H') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='O') ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2=='U') ) {
						int LA8_3 = input.LA(4);
						if ( (LA8_3=='R') ) {
							int LA8_4 = input.LA(5);
							if ( (LA8_4=='S') ) {
								alt8=2;
							}

							else {
								alt8=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:10: 'HOUR'
					{
					match("HOUR"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:19: 'HOURS'
					{
					match("HOURS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HOUR"

	// $ANTLR start "KW_MINUTE"
	public final void mKW_MINUTE() throws RecognitionException {
		try {
			int _type = KW_MINUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:10: ( 'MINUTE' | 'MINUTES' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='M') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='I') ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2=='N') ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3=='U') ) {
							int LA9_4 = input.LA(5);
							if ( (LA9_4=='T') ) {
								int LA9_5 = input.LA(6);
								if ( (LA9_5=='E') ) {
									int LA9_6 = input.LA(7);
									if ( (LA9_6=='S') ) {
										alt9=2;
									}

									else {
										alt9=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:12: 'MINUTE'
					{
					match("MINUTE"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:23: 'MINUTES'
					{
					match("MINUTES"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUTE"

	// $ANTLR start "KW_SECOND"
	public final void mKW_SECOND() throws RecognitionException {
		try {
			int _type = KW_SECOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:10: ( 'SECOND' | 'SECONDS' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='S') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='E') ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2=='C') ) {
						int LA10_3 = input.LA(4);
						if ( (LA10_3=='O') ) {
							int LA10_4 = input.LA(5);
							if ( (LA10_4=='N') ) {
								int LA10_5 = input.LA(6);
								if ( (LA10_5=='D') ) {
									int LA10_6 = input.LA(7);
									if ( (LA10_6=='S') ) {
										alt10=2;
									}

									else {
										alt10=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 10, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 10, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:12: 'SECOND'
					{
					match("SECOND"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:23: 'SECONDS'
					{
					match("SECONDS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SECOND"

	// $ANTLR start "KW_START"
	public final void mKW_START() throws RecognitionException {
		try {
			int _type = KW_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:324:9: ( 'START' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:324:11: 'START'
			{
			match("START"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_START"

	// $ANTLR start "KW_TRANSACTION"
	public final void mKW_TRANSACTION() throws RecognitionException {
		try {
			int _type = KW_TRANSACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:325:15: ( 'TRANSACTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:325:17: 'TRANSACTION'
			{
			match("TRANSACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTION"

	// $ANTLR start "KW_COMMIT"
	public final void mKW_COMMIT() throws RecognitionException {
		try {
			int _type = KW_COMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:326:10: ( 'COMMIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:326:12: 'COMMIT'
			{
			match("COMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMIT"

	// $ANTLR start "KW_ROLLBACK"
	public final void mKW_ROLLBACK() throws RecognitionException {
		try {
			int _type = KW_ROLLBACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:327:12: ( 'ROLLBACK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:327:14: 'ROLLBACK'
			{
			match("ROLLBACK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLBACK"

	// $ANTLR start "KW_WORK"
	public final void mKW_WORK() throws RecognitionException {
		try {
			int _type = KW_WORK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:328:8: ( 'WORK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:328:10: 'WORK'
			{
			match("WORK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WORK"

	// $ANTLR start "KW_ONLY"
	public final void mKW_ONLY() throws RecognitionException {
		try {
			int _type = KW_ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:329:8: ( 'ONLY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:329:10: 'ONLY'
			{
			match("ONLY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ONLY"

	// $ANTLR start "KW_WRITE"
	public final void mKW_WRITE() throws RecognitionException {
		try {
			int _type = KW_WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:330:9: ( 'WRITE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:330:11: 'WRITE'
			{
			match("WRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WRITE"

	// $ANTLR start "KW_ISOLATION"
	public final void mKW_ISOLATION() throws RecognitionException {
		try {
			int _type = KW_ISOLATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:331:13: ( 'ISOLATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:331:15: 'ISOLATION'
			{
			match("ISOLATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ISOLATION"

	// $ANTLR start "KW_LEVEL"
	public final void mKW_LEVEL() throws RecognitionException {
		try {
			int _type = KW_LEVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:332:9: ( 'LEVEL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:332:11: 'LEVEL'
			{
			match("LEVEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEVEL"

	// $ANTLR start "KW_SNAPSHOT"
	public final void mKW_SNAPSHOT() throws RecognitionException {
		try {
			int _type = KW_SNAPSHOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:333:12: ( 'SNAPSHOT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:333:14: 'SNAPSHOT'
			{
			match("SNAPSHOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SNAPSHOT"

	// $ANTLR start "KW_AUTOCOMMIT"
	public final void mKW_AUTOCOMMIT() throws RecognitionException {
		try {
			int _type = KW_AUTOCOMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:334:14: ( 'AUTOCOMMIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:334:16: 'AUTOCOMMIT'
			{
			match("AUTOCOMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTOCOMMIT"

	// $ANTLR start "KW_CACHE"
	public final void mKW_CACHE() throws RecognitionException {
		try {
			int _type = KW_CACHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:335:9: ( 'CACHE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:335:11: 'CACHE'
			{
			match("CACHE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CACHE"

	// $ANTLR start "KW_PRIMARY"
	public final void mKW_PRIMARY() throws RecognitionException {
		try {
			int _type = KW_PRIMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:336:11: ( 'PRIMARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:336:13: 'PRIMARY'
			{
			match("PRIMARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRIMARY"

	// $ANTLR start "KW_FOREIGN"
	public final void mKW_FOREIGN() throws RecognitionException {
		try {
			int _type = KW_FOREIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:337:11: ( 'FOREIGN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:337:13: 'FOREIGN'
			{
			match("FOREIGN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOREIGN"

	// $ANTLR start "KW_REFERENCES"
	public final void mKW_REFERENCES() throws RecognitionException {
		try {
			int _type = KW_REFERENCES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:338:14: ( 'REFERENCES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:338:16: 'REFERENCES'
			{
			match("REFERENCES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REFERENCES"

	// $ANTLR start "KW_CONSTRAINT"
	public final void mKW_CONSTRAINT() throws RecognitionException {
		try {
			int _type = KW_CONSTRAINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:339:14: ( 'CONSTRAINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:339:16: 'CONSTRAINT'
			{
			match("CONSTRAINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONSTRAINT"

	// $ANTLR start "KW_FORCE"
	public final void mKW_FORCE() throws RecognitionException {
		try {
			int _type = KW_FORCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:340:9: ( 'FORCE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:340:11: 'FORCE'
			{
			match("FORCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORCE"

	// $ANTLR start "KW_ENFORCED"
	public final void mKW_ENFORCED() throws RecognitionException {
		try {
			int _type = KW_ENFORCED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:341:12: ( 'ENFORCED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:341:14: 'ENFORCED'
			{
			match("ENFORCED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENFORCED"

	// $ANTLR start "KW_VALIDATE"
	public final void mKW_VALIDATE() throws RecognitionException {
		try {
			int _type = KW_VALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:342:12: ( 'VALIDATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:342:14: 'VALIDATE'
			{
			match("VALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALIDATE"

	// $ANTLR start "KW_NOVALIDATE"
	public final void mKW_NOVALIDATE() throws RecognitionException {
		try {
			int _type = KW_NOVALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:343:14: ( 'NOVALIDATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:343:16: 'NOVALIDATE'
			{
			match("NOVALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOVALIDATE"

	// $ANTLR start "KW_RELY"
	public final void mKW_RELY() throws RecognitionException {
		try {
			int _type = KW_RELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:344:8: ( 'RELY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:344:10: 'RELY'
			{
			match("RELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELY"

	// $ANTLR start "KW_NORELY"
	public final void mKW_NORELY() throws RecognitionException {
		try {
			int _type = KW_NORELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:345:10: ( 'NORELY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:345:12: 'NORELY'
			{
			match("NORELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NORELY"

	// $ANTLR start "KW_UNIQUE"
	public final void mKW_UNIQUE() throws RecognitionException {
		try {
			int _type = KW_UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:346:10: ( 'UNIQUE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:346:12: 'UNIQUE'
			{
			match("UNIQUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUE"

	// $ANTLR start "KW_KEY"
	public final void mKW_KEY() throws RecognitionException {
		try {
			int _type = KW_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:347:7: ( 'KEY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:347:9: 'KEY'
			{
			match("KEY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY"

	// $ANTLR start "KW_ABORT"
	public final void mKW_ABORT() throws RecognitionException {
		try {
			int _type = KW_ABORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:348:9: ( 'ABORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:348:11: 'ABORT'
			{
			match("ABORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ABORT"

	// $ANTLR start "KW_EXTRACT"
	public final void mKW_EXTRACT() throws RecognitionException {
		try {
			int _type = KW_EXTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:349:11: ( 'EXTRACT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:349:13: 'EXTRACT'
			{
			match("EXTRACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTRACT"

	// $ANTLR start "KW_FLOOR"
	public final void mKW_FLOOR() throws RecognitionException {
		try {
			int _type = KW_FLOOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:350:9: ( 'FLOOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:350:11: 'FLOOR'
			{
			match("FLOOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOOR"

	// $ANTLR start "KW_MERGE"
	public final void mKW_MERGE() throws RecognitionException {
		try {
			int _type = KW_MERGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:351:9: ( 'MERGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:351:11: 'MERGE'
			{
			match("MERGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MERGE"

	// $ANTLR start "KW_MATCHED"
	public final void mKW_MATCHED() throws RecognitionException {
		try {
			int _type = KW_MATCHED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:352:11: ( 'MATCHED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:352:13: 'MATCHED'
			{
			match("MATCHED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATCHED"

	// $ANTLR start "KW_REPL"
	public final void mKW_REPL() throws RecognitionException {
		try {
			int _type = KW_REPL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:353:8: ( 'REPL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:353:10: 'REPL'
			{
			match("REPL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPL"

	// $ANTLR start "KW_DUMP"
	public final void mKW_DUMP() throws RecognitionException {
		try {
			int _type = KW_DUMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:354:8: ( 'DUMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:354:10: 'DUMP'
			{
			match("DUMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DUMP"

	// $ANTLR start "KW_STATUS"
	public final void mKW_STATUS() throws RecognitionException {
		try {
			int _type = KW_STATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:355:10: ( 'STATUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:355:12: 'STATUS'
			{
			match("STATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATUS"

	// $ANTLR start "KW_VECTORIZATION"
	public final void mKW_VECTORIZATION() throws RecognitionException {
		try {
			int _type = KW_VECTORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:356:17: ( 'VECTORIZATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:356:19: 'VECTORIZATION'
			{
			match("VECTORIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VECTORIZATION"

	// $ANTLR start "KW_SUMMARY"
	public final void mKW_SUMMARY() throws RecognitionException {
		try {
			int _type = KW_SUMMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:357:11: ( 'SUMMARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:357:13: 'SUMMARY'
			{
			match("SUMMARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SUMMARY"

	// $ANTLR start "KW_OPERATOR"
	public final void mKW_OPERATOR() throws RecognitionException {
		try {
			int _type = KW_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:358:12: ( 'OPERATOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:358:14: 'OPERATOR'
			{
			match("OPERATOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPERATOR"

	// $ANTLR start "KW_EXPRESSION"
	public final void mKW_EXPRESSION() throws RecognitionException {
		try {
			int _type = KW_EXPRESSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:359:14: ( 'EXPRESSION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:359:16: 'EXPRESSION'
			{
			match("EXPRESSION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPRESSION"

	// $ANTLR start "KW_DETAIL"
	public final void mKW_DETAIL() throws RecognitionException {
		try {
			int _type = KW_DETAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:360:10: ( 'DETAIL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:360:12: 'DETAIL'
			{
			match("DETAIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DETAIL"

	// $ANTLR start "KW_WAIT"
	public final void mKW_WAIT() throws RecognitionException {
		try {
			int _type = KW_WAIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:361:8: ( 'WAIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:361:10: 'WAIT'
			{
			match("WAIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WAIT"

	// $ANTLR start "KW_RESOURCE"
	public final void mKW_RESOURCE() throws RecognitionException {
		try {
			int _type = KW_RESOURCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:362:12: ( 'RESOURCE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:362:14: 'RESOURCE'
			{
			match("RESOURCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESOURCE"

	// $ANTLR start "KW_PLAN"
	public final void mKW_PLAN() throws RecognitionException {
		try {
			int _type = KW_PLAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:363:8: ( 'PLAN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:363:10: 'PLAN'
			{
			match("PLAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLAN"

	// $ANTLR start "KW_QUERY_PARALLELISM"
	public final void mKW_QUERY_PARALLELISM() throws RecognitionException {
		try {
			int _type = KW_QUERY_PARALLELISM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:364:21: ( 'QUERY_PARALLELISM' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:364:23: 'QUERY_PARALLELISM'
			{
			match("QUERY_PARALLELISM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUERY_PARALLELISM"

	// $ANTLR start "KW_PLANS"
	public final void mKW_PLANS() throws RecognitionException {
		try {
			int _type = KW_PLANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:365:9: ( 'PLANS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:365:11: 'PLANS'
			{
			match("PLANS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLANS"

	// $ANTLR start "KW_ACTIVATE"
	public final void mKW_ACTIVATE() throws RecognitionException {
		try {
			int _type = KW_ACTIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:366:12: ( 'ACTIVATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:366:14: 'ACTIVATE'
			{
			match("ACTIVATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ACTIVATE"

	// $ANTLR start "KW_DEFAULT"
	public final void mKW_DEFAULT() throws RecognitionException {
		try {
			int _type = KW_DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:367:11: ( 'DEFAULT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:367:13: 'DEFAULT'
			{
			match("DEFAULT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFAULT"

	// $ANTLR start "KW_CHECK"
	public final void mKW_CHECK() throws RecognitionException {
		try {
			int _type = KW_CHECK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:9: ( 'CHECK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:11: 'CHECK'
			{
			match("CHECK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHECK"

	// $ANTLR start "KW_POOL"
	public final void mKW_POOL() throws RecognitionException {
		try {
			int _type = KW_POOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:8: ( 'POOL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:10: 'POOL'
			{
			match("POOL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_POOL"

	// $ANTLR start "KW_MOVE"
	public final void mKW_MOVE() throws RecognitionException {
		try {
			int _type = KW_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:370:8: ( 'MOVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:370:10: 'MOVE'
			{
			match("MOVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MOVE"

	// $ANTLR start "KW_DO"
	public final void mKW_DO() throws RecognitionException {
		try {
			int _type = KW_DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:371:6: ( 'DO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:371:8: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DO"

	// $ANTLR start "KW_ALLOC_FRACTION"
	public final void mKW_ALLOC_FRACTION() throws RecognitionException {
		try {
			int _type = KW_ALLOC_FRACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:372:18: ( 'ALLOC_FRACTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:372:20: 'ALLOC_FRACTION'
			{
			match("ALLOC_FRACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALLOC_FRACTION"

	// $ANTLR start "KW_SCHEDULING_POLICY"
	public final void mKW_SCHEDULING_POLICY() throws RecognitionException {
		try {
			int _type = KW_SCHEDULING_POLICY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:373:21: ( 'SCHEDULING_POLICY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:373:23: 'SCHEDULING_POLICY'
			{
			match("SCHEDULING_POLICY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEDULING_POLICY"

	// $ANTLR start "KW_PATH"
	public final void mKW_PATH() throws RecognitionException {
		try {
			int _type = KW_PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:374:8: ( 'PATH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:374:10: 'PATH'
			{
			match("PATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PATH"

	// $ANTLR start "KW_MAPPING"
	public final void mKW_MAPPING() throws RecognitionException {
		try {
			int _type = KW_MAPPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:375:11: ( 'MAPPING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:375:13: 'MAPPING'
			{
			match("MAPPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPPING"

	// $ANTLR start "KW_WORKLOAD"
	public final void mKW_WORKLOAD() throws RecognitionException {
		try {
			int _type = KW_WORKLOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:376:12: ( 'WORKLOAD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:376:14: 'WORKLOAD'
			{
			match("WORKLOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WORKLOAD"

	// $ANTLR start "KW_MANAGEMENT"
	public final void mKW_MANAGEMENT() throws RecognitionException {
		try {
			int _type = KW_MANAGEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:377:14: ( 'MANAGEMENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:377:16: 'MANAGEMENT'
			{
			match("MANAGEMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MANAGEMENT"

	// $ANTLR start "KW_ACTIVE"
	public final void mKW_ACTIVE() throws RecognitionException {
		try {
			int _type = KW_ACTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:378:10: ( 'ACTIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:378:12: 'ACTIVE'
			{
			match("ACTIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ACTIVE"

	// $ANTLR start "KW_UNMANAGED"
	public final void mKW_UNMANAGED() throws RecognitionException {
		try {
			int _type = KW_UNMANAGED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:379:13: ( 'UNMANAGED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:379:15: 'UNMANAGED'
			{
			match("UNMANAGED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNMANAGED"

	// $ANTLR start "KW_APPLICATION"
	public final void mKW_APPLICATION() throws RecognitionException {
		try {
			int _type = KW_APPLICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:380:15: ( 'APPLICATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:380:17: 'APPLICATION'
			{
			match("APPLICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_APPLICATION"

	// $ANTLR start "KW_SYNC"
	public final void mKW_SYNC() throws RecognitionException {
		try {
			int _type = KW_SYNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:381:8: ( 'SYNC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:381:10: 'SYNC'
			{
			match("SYNC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SYNC"

	// $ANTLR start "KW_COST"
	public final void mKW_COST() throws RecognitionException {
		try {
			int _type = KW_COST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:382:8: ( 'COST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:382:10: 'COST'
			{
			match("COST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COST"

	// $ANTLR start "KW_JOINCOST"
	public final void mKW_JOINCOST() throws RecognitionException {
		try {
			int _type = KW_JOINCOST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:383:12: ( 'JOINCOST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:383:14: 'JOINCOST'
			{
			match("JOINCOST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOINCOST"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:388:5: ( '.' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:388:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:389:7: ( ':' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:389:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:390:7: ( ',' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:390:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:391:11: ( ';' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:391:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:393:8: ( '(' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:393:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:394:8: ( ')' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:394:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:395:9: ( '[' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:395:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:396:9: ( ']' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:396:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:397:8: ( '{' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:397:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:398:8: ( '}' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:398:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:400:7: ( '=' | '==' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='=') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='=') ) {
					alt11=2;
				}

				else {
					alt11=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:400:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:400:15: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "EQUAL_NS"
	public final void mEQUAL_NS() throws RecognitionException {
		try {
			int _type = EQUAL_NS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:401:10: ( '<=>' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:401:12: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_NS"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:402:10: ( '<>' | '!=' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='<') ) {
				alt12=1;
			}
			else if ( (LA12_0=='!') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:402:12: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:402:19: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LESSTHANOREQUALTO"
	public final void mLESSTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = LESSTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:403:19: ( '<=' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:403:21: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHANOREQUALTO"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:404:10: ( '<' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:404:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "GREATERTHANOREQUALTO"
	public final void mGREATERTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = GREATERTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:405:22: ( '>=' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:405:24: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHANOREQUALTO"

	// $ANTLR start "GREATERTHAN"
	public final void mGREATERTHAN() throws RecognitionException {
		try {
			int _type = GREATERTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:13: ( '>' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:15: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:408:8: ( '/' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:408:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:409:6: ( '+' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:409:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:410:7: ( '-' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:410:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:411:6: ( '*' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:411:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:412:5: ( '%' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:412:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:413:5: ( 'DIV' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:413:7: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:415:11: ( '&' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:415:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:416:7: ( '~' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:416:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "BITWISEOR"
	public final void mBITWISEOR() throws RecognitionException {
		try {
			int _type = BITWISEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:417:11: ( '|' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:417:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOR"

	// $ANTLR start "CONCATENATE"
	public final void mCONCATENATE() throws RecognitionException {
		try {
			int _type = CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:418:13: ( '||' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:418:15: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONCATENATE"

	// $ANTLR start "BITWISEXOR"
	public final void mBITWISEXOR() throws RecognitionException {
		try {
			int _type = BITWISEXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:419:12: ( '^' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:419:14: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEXOR"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:420:10: ( '?' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:420:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:421:8: ( '$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:421:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:426:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:431:5: ( 'a' .. 'f' | 'A' .. 'F' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:436:5: ( '0' .. '9' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:442:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:443:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:443:17: ( PLUS | MINUS )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='+'||LA13_0=='-') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:443:33: ( Digit )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "RegexComponent"
	public final void mRegexComponent() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:448:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR | '!' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RegexComponent"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:455:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\'') ) {
					alt17=1;
				}
				else if ( (LA17_0=='\"') ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
					{
					match('\''); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
					loop15:
					while (true) {
						int alt15=3;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}
						else if ( (LA15_0=='\\') ) {
							alt15=2;
						}

						switch (alt15) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:14: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:29: ( '\\\\' . )
							{
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:29: ( '\\\\' . )
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop15;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:457:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
					{
					match('\"'); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:457:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
					loop16:
					while (true) {
						int alt16=3;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}
						else if ( (LA16_0=='\\') ) {
							alt16=2;
						}

						switch (alt16) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:457:14: ~ ( '\\\"' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:457:29: ( '\\\\' . )
							{
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:457:29: ( '\\\\' . )
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:457:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop16;
						}
					}

					match('\"'); 
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "CharSetLiteral"
	public final void mCharSetLiteral() throws RecognitionException {
		try {
			int _type = CharSetLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:462:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\"'||LA19_0=='\'') ) {
				alt19=1;
			}
			else if ( (LA19_0=='0') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:463:5: StringLiteral
					{
					mStringLiteral(); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:7: '0' 'X' ( HexDigit | Digit )+
					{
					match('0'); 
					match('X'); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:15: ( HexDigit | Digit )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'F')||(LA18_0 >= 'a' && LA18_0 <= 'f')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetLiteral"

	// $ANTLR start "IntegralLiteral"
	public final void mIntegralLiteral() throws RecognitionException {
		try {
			int _type = IntegralLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:468:5: ( ( Digit )+ ( 'L' | 'S' | 'Y' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:469:5: ( Digit )+ ( 'L' | 'S' | 'Y' )
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:469:5: ( Digit )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			if ( input.LA(1)=='L'||input.LA(1)=='S'||input.LA(1)=='Y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegralLiteral"

	// $ANTLR start "NumberLiteral"
	public final void mNumberLiteral() throws RecognitionException {
		try {
			int _type = NumberLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:473:5: ( Number ( 'D' | 'B' 'D' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:474:5: Number ( 'D' | 'B' 'D' )
			{
			mNumber(); 

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:474:12: ( 'D' | 'B' 'D' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='D') ) {
				alt21=1;
			}
			else if ( (LA21_0=='B') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:474:13: 'D'
					{
					match('D'); 
					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:474:19: 'B' 'D'
					{
					match('B'); 
					match('D'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NumberLiteral"

	// $ANTLR start "ByteLengthLiteral"
	public final void mByteLengthLiteral() throws RecognitionException {
		try {
			int _type = ByteLengthLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:478:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:479:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:479:5: ( Digit )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ByteLengthLiteral"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:483:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:5: ( Digit )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
			int alt26=3;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='.') ) {
				alt26=1;
			}
			else if ( (LA26_0=='E'||LA26_0=='e') ) {
				alt26=2;
			}
			switch (alt26) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:16: DOT ( Digit )* ( Exponent )?
					{
					mDOT(); 

					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:20: ( Digit )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop24;
						}
					}

					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:29: ( Exponent )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='E'||LA25_0=='e') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:30: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:484:43: Exponent
					{
					mExponent(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:509:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' )
			int alt29=3;
			alt29 = dfa29.predict(input);
			switch (alt29) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:510:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:510:22: ( Letter | Digit | '_' )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= '0' && LA27_0 <= '9')||(LA27_0 >= 'A' && LA27_0 <= 'Z')||LA27_0=='_'||(LA27_0 >= 'a' && LA27_0 <= 'z')) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop27;
						}
					}

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:511:7: {...}? QuotedIdentifier
					{
					if ( !((allowQuotedId())) ) {
						throw new FailedPredicateException(input, "Identifier", "allowQuotedId()");
					}
					mQuotedIdentifier(); 

					}
					break;
				case 3 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:513:7: '`' ( RegexComponent )+ '`'
					{
					match('`'); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:513:11: ( RegexComponent )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0=='!'||LA28_0=='$'||(LA28_0 >= '(' && LA28_0 <= '+')||(LA28_0 >= '-' && LA28_0 <= '.')||(LA28_0 >= '0' && LA28_0 <= '9')||LA28_0=='?'||(LA28_0 >= 'A' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '_')||(LA28_0 >= 'a' && LA28_0 <= '}')) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					match('`'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "QuotedIdentifier"
	public final void mQuotedIdentifier() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:518:5: ( '`' ( '``' |~ ( '`' ) )* '`' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:519:5: '`' ( '``' |~ ( '`' ) )* '`'
			{
			match('`'); 
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:519:10: ( '``' |~ ( '`' ) )*
			loop30:
			while (true) {
				int alt30=3;
				int LA30_0 = input.LA(1);
				if ( (LA30_0=='`') ) {
					int LA30_1 = input.LA(2);
					if ( (LA30_1=='`') ) {
						alt30=1;
					}

				}
				else if ( ((LA30_0 >= '\u0000' && LA30_0 <= '_')||(LA30_0 >= 'a' && LA30_0 <= '\uFFFF')) ) {
					alt30=2;
				}

				switch (alt30) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:519:12: '``'
					{
					match("``"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:519:19: ~ ( '`' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop30;
				}
			}

			match('`'); 
			 setText(getText().substring(1, getText().length() -1 ).replaceAll("``", "`")); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QuotedIdentifier"

	// $ANTLR start "CharSetName"
	public final void mCharSetName() throws RecognitionException {
		try {
			int _type = CharSetName;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:523:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:524:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
			{
			match('_'); 
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:524:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( ((LA31_0 >= '-' && LA31_0 <= '.')||(LA31_0 >= '0' && LA31_0 <= ':')||(LA31_0 >= 'A' && LA31_0 <= 'Z')||LA31_0=='_'||(LA31_0 >= 'a' && LA31_0 <= 'z')) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetName"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:527:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:527:8: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:531:5: ( '--' (~ ( '\\n' | '\\r' ) )* )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:531:7: '--' (~ ( '\\n' | '\\r' ) )*
			{
			match("--"); 

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:531:12: (~ ( '\\n' | '\\r' ) )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\t')||(LA32_0 >= '\u000B' && LA32_0 <= '\f')||(LA32_0 >= '\u000E' && LA32_0 <= '\uFFFF')) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop32;
				}
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "QUERY_HINT"
	public final void mQUERY_HINT() throws RecognitionException {
		try {
			int _type = QUERY_HINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:535:5: ( '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:535:7: '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/'
			{
			match("/*"); 

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:535:12: ( options {greedy=false; } : QUERY_HINT | . )*
			loop33:
			while (true) {
				int alt33=3;
				int LA33_0 = input.LA(1);
				if ( (LA33_0=='*') ) {
					int LA33_1 = input.LA(2);
					if ( (LA33_1=='/') ) {
						alt33=3;
					}
					else if ( ((LA33_1 >= '\u0000' && LA33_1 <= '.')||(LA33_1 >= '0' && LA33_1 <= '\uFFFF')) ) {
						alt33=2;
					}

				}
				else if ( (LA33_0=='/') ) {
					int LA33_2 = input.LA(2);
					if ( (LA33_2=='*') ) {
						alt33=1;
					}
					else if ( ((LA33_2 >= '\u0000' && LA33_2 <= ')')||(LA33_2 >= '+' && LA33_2 <= '\uFFFF')) ) {
						alt33=2;
					}

				}
				else if ( ((LA33_0 >= '\u0000' && LA33_0 <= ')')||(LA33_0 >= '+' && LA33_0 <= '.')||(LA33_0 >= '0' && LA33_0 <= '\uFFFF')) ) {
					alt33=2;
				}

				switch (alt33) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:535:41: QUERY_HINT
					{
					mQUERY_HINT(); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:535:52: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop33;
				}
			}

			match("*/"); 

			 if(getText().charAt(2) != '+') { _channel=HIDDEN; } else { setText(getText().substring(3, getText().length() - 2)); } 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERY_HINT"

	@Override
	public void mTokens() throws RecognitionException {
		// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_DISTRIBUTED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_CBO | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_COST | KW_JOINCOST | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT )
		int alt34=379;
		alt34 = dfa34.predict(input);
		switch (alt34) {
			case 1 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:10: KW_TRUE
				{
				mKW_TRUE(); 

				}
				break;
			case 2 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:18: KW_FALSE
				{
				mKW_FALSE(); 

				}
				break;
			case 3 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:27: KW_ALL
				{
				mKW_ALL(); 

				}
				break;
			case 4 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:34: KW_NONE
				{
				mKW_NONE(); 

				}
				break;
			case 5 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:42: KW_AND
				{
				mKW_AND(); 

				}
				break;
			case 6 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:49: KW_OR
				{
				mKW_OR(); 

				}
				break;
			case 7 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:55: KW_NOT
				{
				mKW_NOT(); 

				}
				break;
			case 8 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:62: KW_LIKE
				{
				mKW_LIKE(); 

				}
				break;
			case 9 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:70: KW_ANY
				{
				mKW_ANY(); 

				}
				break;
			case 10 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:77: KW_IF
				{
				mKW_IF(); 

				}
				break;
			case 11 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:83: KW_EXISTS
				{
				mKW_EXISTS(); 

				}
				break;
			case 12 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:93: KW_ASC
				{
				mKW_ASC(); 

				}
				break;
			case 13 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:100: KW_DESC
				{
				mKW_DESC(); 

				}
				break;
			case 14 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:108: KW_NULLS
				{
				mKW_NULLS(); 

				}
				break;
			case 15 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:117: KW_LAST
				{
				mKW_LAST(); 

				}
				break;
			case 16 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:125: KW_ORDER
				{
				mKW_ORDER(); 

				}
				break;
			case 17 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:134: KW_GROUP
				{
				mKW_GROUP(); 

				}
				break;
			case 18 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:143: KW_BY
				{
				mKW_BY(); 

				}
				break;
			case 19 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:149: KW_HAVING
				{
				mKW_HAVING(); 

				}
				break;
			case 20 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:159: KW_WHERE
				{
				mKW_WHERE(); 

				}
				break;
			case 21 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:168: KW_FROM
				{
				mKW_FROM(); 

				}
				break;
			case 22 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:176: KW_AS
				{
				mKW_AS(); 

				}
				break;
			case 23 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:182: KW_SELECT
				{
				mKW_SELECT(); 

				}
				break;
			case 24 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:192: KW_DISTINCT
				{
				mKW_DISTINCT(); 

				}
				break;
			case 25 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:204: KW_INSERT
				{
				mKW_INSERT(); 

				}
				break;
			case 26 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:214: KW_OVERWRITE
				{
				mKW_OVERWRITE(); 

				}
				break;
			case 27 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:227: KW_OUTER
				{
				mKW_OUTER(); 

				}
				break;
			case 28 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:236: KW_UNIQUEJOIN
				{
				mKW_UNIQUEJOIN(); 

				}
				break;
			case 29 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:250: KW_PRESERVE
				{
				mKW_PRESERVE(); 

				}
				break;
			case 30 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:262: KW_JOIN
				{
				mKW_JOIN(); 

				}
				break;
			case 31 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:270: KW_LEFT
				{
				mKW_LEFT(); 

				}
				break;
			case 32 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:278: KW_RIGHT
				{
				mKW_RIGHT(); 

				}
				break;
			case 33 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:287: KW_FULL
				{
				mKW_FULL(); 

				}
				break;
			case 34 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:295: KW_ON
				{
				mKW_ON(); 

				}
				break;
			case 35 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:301: KW_PARTITION
				{
				mKW_PARTITION(); 

				}
				break;
			case 36 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:314: KW_PARTITIONS
				{
				mKW_PARTITIONS(); 

				}
				break;
			case 37 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:328: KW_TABLE
				{
				mKW_TABLE(); 

				}
				break;
			case 38 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:337: KW_TABLES
				{
				mKW_TABLES(); 

				}
				break;
			case 39 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:347: KW_COLUMNS
				{
				mKW_COLUMNS(); 

				}
				break;
			case 40 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:358: KW_INDEX
				{
				mKW_INDEX(); 

				}
				break;
			case 41 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:367: KW_INDEXES
				{
				mKW_INDEXES(); 

				}
				break;
			case 42 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:378: KW_REBUILD
				{
				mKW_REBUILD(); 

				}
				break;
			case 43 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:389: KW_FUNCTIONS
				{
				mKW_FUNCTIONS(); 

				}
				break;
			case 44 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:402: KW_SHOW
				{
				mKW_SHOW(); 

				}
				break;
			case 45 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:410: KW_MSCK
				{
				mKW_MSCK(); 

				}
				break;
			case 46 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:418: KW_REPAIR
				{
				mKW_REPAIR(); 

				}
				break;
			case 47 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:428: KW_DIRECTORY
				{
				mKW_DIRECTORY(); 

				}
				break;
			case 48 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:441: KW_LOCAL
				{
				mKW_LOCAL(); 

				}
				break;
			case 49 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:450: KW_TRANSFORM
				{
				mKW_TRANSFORM(); 

				}
				break;
			case 50 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:463: KW_USING
				{
				mKW_USING(); 

				}
				break;
			case 51 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:472: KW_CLUSTER
				{
				mKW_CLUSTER(); 

				}
				break;
			case 52 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:483: KW_DISTRIBUTE
				{
				mKW_DISTRIBUTE(); 

				}
				break;
			case 53 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:497: KW_SORT
				{
				mKW_SORT(); 

				}
				break;
			case 54 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:505: KW_UNION
				{
				mKW_UNION(); 

				}
				break;
			case 55 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:514: KW_EXCEPT
				{
				mKW_EXCEPT(); 

				}
				break;
			case 56 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:524: KW_LOAD
				{
				mKW_LOAD(); 

				}
				break;
			case 57 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:532: KW_EXPORT
				{
				mKW_EXPORT(); 

				}
				break;
			case 58 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:542: KW_IMPORT
				{
				mKW_IMPORT(); 

				}
				break;
			case 59 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:552: KW_REPLICATION
				{
				mKW_REPLICATION(); 

				}
				break;
			case 60 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:567: KW_METADATA
				{
				mKW_METADATA(); 

				}
				break;
			case 61 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:579: KW_DATA
				{
				mKW_DATA(); 

				}
				break;
			case 62 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:587: KW_INPATH
				{
				mKW_INPATH(); 

				}
				break;
			case 63 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:597: KW_IS
				{
				mKW_IS(); 

				}
				break;
			case 64 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:603: KW_NULL
				{
				mKW_NULL(); 

				}
				break;
			case 65 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:611: KW_CREATE
				{
				mKW_CREATE(); 

				}
				break;
			case 66 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:621: KW_EXTERNAL
				{
				mKW_EXTERNAL(); 

				}
				break;
			case 67 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:633: KW_ALTER
				{
				mKW_ALTER(); 

				}
				break;
			case 68 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:642: KW_CHANGE
				{
				mKW_CHANGE(); 

				}
				break;
			case 69 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:652: KW_COLUMN
				{
				mKW_COLUMN(); 

				}
				break;
			case 70 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:662: KW_FIRST
				{
				mKW_FIRST(); 

				}
				break;
			case 71 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:671: KW_AFTER
				{
				mKW_AFTER(); 

				}
				break;
			case 72 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:680: KW_DESCRIBE
				{
				mKW_DESCRIBE(); 

				}
				break;
			case 73 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:692: KW_DROP
				{
				mKW_DROP(); 

				}
				break;
			case 74 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:700: KW_RENAME
				{
				mKW_RENAME(); 

				}
				break;
			case 75 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:710: KW_TO
				{
				mKW_TO(); 

				}
				break;
			case 76 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:716: KW_COMMENT
				{
				mKW_COMMENT(); 

				}
				break;
			case 77 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:727: KW_BOOLEAN
				{
				mKW_BOOLEAN(); 

				}
				break;
			case 78 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:738: KW_TINYINT
				{
				mKW_TINYINT(); 

				}
				break;
			case 79 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:749: KW_SMALLINT
				{
				mKW_SMALLINT(); 

				}
				break;
			case 80 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:761: KW_INT
				{
				mKW_INT(); 

				}
				break;
			case 81 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:768: KW_BIGINT
				{
				mKW_BIGINT(); 

				}
				break;
			case 82 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:778: KW_FLOAT
				{
				mKW_FLOAT(); 

				}
				break;
			case 83 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:787: KW_DOUBLE
				{
				mKW_DOUBLE(); 

				}
				break;
			case 84 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:797: KW_PRECISION
				{
				mKW_PRECISION(); 

				}
				break;
			case 85 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:810: KW_DATE
				{
				mKW_DATE(); 

				}
				break;
			case 86 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:818: KW_DATETIME
				{
				mKW_DATETIME(); 

				}
				break;
			case 87 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:830: KW_TIMESTAMP
				{
				mKW_TIMESTAMP(); 

				}
				break;
			case 88 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:843: KW_TIMESTAMPLOCALTZ
				{
				mKW_TIMESTAMPLOCALTZ(); 

				}
				break;
			case 89 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:863: KW_TIME
				{
				mKW_TIME(); 

				}
				break;
			case 90 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:871: KW_ZONE
				{
				mKW_ZONE(); 

				}
				break;
			case 91 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:879: KW_INTERVAL
				{
				mKW_INTERVAL(); 

				}
				break;
			case 92 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:891: KW_DECIMAL
				{
				mKW_DECIMAL(); 

				}
				break;
			case 93 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:902: KW_STRING
				{
				mKW_STRING(); 

				}
				break;
			case 94 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:912: KW_CHAR
				{
				mKW_CHAR(); 

				}
				break;
			case 95 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:920: KW_VARCHAR
				{
				mKW_VARCHAR(); 

				}
				break;
			case 96 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:931: KW_ARRAY
				{
				mKW_ARRAY(); 

				}
				break;
			case 97 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:940: KW_STRUCT
				{
				mKW_STRUCT(); 

				}
				break;
			case 98 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:950: KW_MAP
				{
				mKW_MAP(); 

				}
				break;
			case 99 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:957: KW_UNIONTYPE
				{
				mKW_UNIONTYPE(); 

				}
				break;
			case 100 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:970: KW_REDUCE
				{
				mKW_REDUCE(); 

				}
				break;
			case 101 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:980: KW_PARTITIONED
				{
				mKW_PARTITIONED(); 

				}
				break;
			case 102 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:995: KW_CLUSTERED
				{
				mKW_CLUSTERED(); 

				}
				break;
			case 103 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1008: KW_DISTRIBUTED
				{
				mKW_DISTRIBUTED(); 

				}
				break;
			case 104 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1023: KW_SORTED
				{
				mKW_SORTED(); 

				}
				break;
			case 105 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1033: KW_INTO
				{
				mKW_INTO(); 

				}
				break;
			case 106 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1041: KW_BUCKETS
				{
				mKW_BUCKETS(); 

				}
				break;
			case 107 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1052: KW_ROW
				{
				mKW_ROW(); 

				}
				break;
			case 108 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1059: KW_ROWS
				{
				mKW_ROWS(); 

				}
				break;
			case 109 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1067: KW_FORMAT
				{
				mKW_FORMAT(); 

				}
				break;
			case 110 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1077: KW_DELIMITED
				{
				mKW_DELIMITED(); 

				}
				break;
			case 111 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1090: KW_FIELDS
				{
				mKW_FIELDS(); 

				}
				break;
			case 112 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1100: KW_TERMINATED
				{
				mKW_TERMINATED(); 

				}
				break;
			case 113 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1114: KW_ESCAPED
				{
				mKW_ESCAPED(); 

				}
				break;
			case 114 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1125: KW_COLLECTION
				{
				mKW_COLLECTION(); 

				}
				break;
			case 115 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1139: KW_ITEMS
				{
				mKW_ITEMS(); 

				}
				break;
			case 116 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1148: KW_KEYS
				{
				mKW_KEYS(); 

				}
				break;
			case 117 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1156: KW_KEY_TYPE
				{
				mKW_KEY_TYPE(); 

				}
				break;
			case 118 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1168: KW_KILL
				{
				mKW_KILL(); 

				}
				break;
			case 119 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1176: KW_LINES
				{
				mKW_LINES(); 

				}
				break;
			case 120 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1185: KW_STORED
				{
				mKW_STORED(); 

				}
				break;
			case 121 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1195: KW_FILEFORMAT
				{
				mKW_FILEFORMAT(); 

				}
				break;
			case 122 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1209: KW_INPUTFORMAT
				{
				mKW_INPUTFORMAT(); 

				}
				break;
			case 123 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1224: KW_OUTPUTFORMAT
				{
				mKW_OUTPUTFORMAT(); 

				}
				break;
			case 124 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1240: KW_INPUTDRIVER
				{
				mKW_INPUTDRIVER(); 

				}
				break;
			case 125 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1255: KW_OUTPUTDRIVER
				{
				mKW_OUTPUTDRIVER(); 

				}
				break;
			case 126 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1271: KW_ENABLE
				{
				mKW_ENABLE(); 

				}
				break;
			case 127 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1281: KW_DISABLE
				{
				mKW_DISABLE(); 

				}
				break;
			case 128 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1292: KW_LOCATION
				{
				mKW_LOCATION(); 

				}
				break;
			case 129 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1304: KW_TABLESAMPLE
				{
				mKW_TABLESAMPLE(); 

				}
				break;
			case 130 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1319: KW_BUCKET
				{
				mKW_BUCKET(); 

				}
				break;
			case 131 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1329: KW_OUT
				{
				mKW_OUT(); 

				}
				break;
			case 132 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1336: KW_OF
				{
				mKW_OF(); 

				}
				break;
			case 133 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1342: KW_PERCENT
				{
				mKW_PERCENT(); 

				}
				break;
			case 134 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1353: KW_CAST
				{
				mKW_CAST(); 

				}
				break;
			case 135 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1361: KW_ADD
				{
				mKW_ADD(); 

				}
				break;
			case 136 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1368: KW_REPLACE
				{
				mKW_REPLACE(); 

				}
				break;
			case 137 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1379: KW_RLIKE
				{
				mKW_RLIKE(); 

				}
				break;
			case 138 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1388: KW_REGEXP
				{
				mKW_REGEXP(); 

				}
				break;
			case 139 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1398: KW_TEMPORARY
				{
				mKW_TEMPORARY(); 

				}
				break;
			case 140 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1411: KW_FUNCTION
				{
				mKW_FUNCTION(); 

				}
				break;
			case 141 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1423: KW_MACRO
				{
				mKW_MACRO(); 

				}
				break;
			case 142 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1432: KW_FILE
				{
				mKW_FILE(); 

				}
				break;
			case 143 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1440: KW_JAR
				{
				mKW_JAR(); 

				}
				break;
			case 144 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1447: KW_EXPLAIN
				{
				mKW_EXPLAIN(); 

				}
				break;
			case 145 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1458: KW_EXTENDED
				{
				mKW_EXTENDED(); 

				}
				break;
			case 146 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1470: KW_DEBUG
				{
				mKW_DEBUG(); 

				}
				break;
			case 147 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1479: KW_FORMATTED
				{
				mKW_FORMATTED(); 

				}
				break;
			case 148 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1492: KW_DEPENDENCY
				{
				mKW_DEPENDENCY(); 

				}
				break;
			case 149 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1506: KW_LOGICAL
				{
				mKW_LOGICAL(); 

				}
				break;
			case 150 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1517: KW_CBO
				{
				mKW_CBO(); 

				}
				break;
			case 151 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1524: KW_SERDE
				{
				mKW_SERDE(); 

				}
				break;
			case 152 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1533: KW_WITH
				{
				mKW_WITH(); 

				}
				break;
			case 153 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1541: KW_DEFERRED
				{
				mKW_DEFERRED(); 

				}
				break;
			case 154 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1553: KW_SERDEPROPERTIES
				{
				mKW_SERDEPROPERTIES(); 

				}
				break;
			case 155 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1572: KW_DBPROPERTIES
				{
				mKW_DBPROPERTIES(); 

				}
				break;
			case 156 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1588: KW_LIMIT
				{
				mKW_LIMIT(); 

				}
				break;
			case 157 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1597: KW_OFFSET
				{
				mKW_OFFSET(); 

				}
				break;
			case 158 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1607: KW_SET
				{
				mKW_SET(); 

				}
				break;
			case 159 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1614: KW_UNSET
				{
				mKW_UNSET(); 

				}
				break;
			case 160 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1623: KW_TBLPROPERTIES
				{
				mKW_TBLPROPERTIES(); 

				}
				break;
			case 161 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1640: KW_IDXPROPERTIES
				{
				mKW_IDXPROPERTIES(); 

				}
				break;
			case 162 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1657: KW_VALUE_TYPE
				{
				mKW_VALUE_TYPE(); 

				}
				break;
			case 163 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1671: KW_ELEM_TYPE
				{
				mKW_ELEM_TYPE(); 

				}
				break;
			case 164 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1684: KW_DEFINED
				{
				mKW_DEFINED(); 

				}
				break;
			case 165 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1695: KW_CASE
				{
				mKW_CASE(); 

				}
				break;
			case 166 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1703: KW_WHEN
				{
				mKW_WHEN(); 

				}
				break;
			case 167 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1711: KW_THEN
				{
				mKW_THEN(); 

				}
				break;
			case 168 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1719: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 169 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1727: KW_END
				{
				mKW_END(); 

				}
				break;
			case 170 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1734: KW_MAPJOIN
				{
				mKW_MAPJOIN(); 

				}
				break;
			case 171 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1745: KW_STREAMTABLE
				{
				mKW_STREAMTABLE(); 

				}
				break;
			case 172 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1760: KW_CLUSTERSTATUS
				{
				mKW_CLUSTERSTATUS(); 

				}
				break;
			case 173 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1777: KW_UTC
				{
				mKW_UTC(); 

				}
				break;
			case 174 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1784: KW_UTCTIMESTAMP
				{
				mKW_UTCTIMESTAMP(); 

				}
				break;
			case 175 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1800: KW_LONG
				{
				mKW_LONG(); 

				}
				break;
			case 176 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1808: KW_DELETE
				{
				mKW_DELETE(); 

				}
				break;
			case 177 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1818: KW_PLUS
				{
				mKW_PLUS(); 

				}
				break;
			case 178 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1826: KW_MINUS
				{
				mKW_MINUS(); 

				}
				break;
			case 179 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1835: KW_FETCH
				{
				mKW_FETCH(); 

				}
				break;
			case 180 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1844: KW_INTERSECT
				{
				mKW_INTERSECT(); 

				}
				break;
			case 181 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1857: KW_VIEW
				{
				mKW_VIEW(); 

				}
				break;
			case 182 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1865: KW_VIEWS
				{
				mKW_VIEWS(); 

				}
				break;
			case 183 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1874: KW_IN
				{
				mKW_IN(); 

				}
				break;
			case 184 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1880: KW_DATABASE
				{
				mKW_DATABASE(); 

				}
				break;
			case 185 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1892: KW_DATABASES
				{
				mKW_DATABASES(); 

				}
				break;
			case 186 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1905: KW_MATERIALIZED
				{
				mKW_MATERIALIZED(); 

				}
				break;
			case 187 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1921: KW_SCHEMA
				{
				mKW_SCHEMA(); 

				}
				break;
			case 188 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1931: KW_SCHEMAS
				{
				mKW_SCHEMAS(); 

				}
				break;
			case 189 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1942: KW_GRANT
				{
				mKW_GRANT(); 

				}
				break;
			case 190 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1951: KW_REVOKE
				{
				mKW_REVOKE(); 

				}
				break;
			case 191 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1961: KW_SSL
				{
				mKW_SSL(); 

				}
				break;
			case 192 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1968: KW_UNDO
				{
				mKW_UNDO(); 

				}
				break;
			case 193 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1976: KW_LOCK
				{
				mKW_LOCK(); 

				}
				break;
			case 194 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1984: KW_LOCKS
				{
				mKW_LOCKS(); 

				}
				break;
			case 195 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1993: KW_UNLOCK
				{
				mKW_UNLOCK(); 

				}
				break;
			case 196 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2003: KW_SHARED
				{
				mKW_SHARED(); 

				}
				break;
			case 197 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2013: KW_EXCLUSIVE
				{
				mKW_EXCLUSIVE(); 

				}
				break;
			case 198 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2026: KW_PROCEDURE
				{
				mKW_PROCEDURE(); 

				}
				break;
			case 199 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2039: KW_UNSIGNED
				{
				mKW_UNSIGNED(); 

				}
				break;
			case 200 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2051: KW_WHILE
				{
				mKW_WHILE(); 

				}
				break;
			case 201 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2060: KW_READ
				{
				mKW_READ(); 

				}
				break;
			case 202 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2068: KW_READS
				{
				mKW_READS(); 

				}
				break;
			case 203 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2077: KW_PURGE
				{
				mKW_PURGE(); 

				}
				break;
			case 204 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2086: KW_RANGE
				{
				mKW_RANGE(); 

				}
				break;
			case 205 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2095: KW_ANALYZE
				{
				mKW_ANALYZE(); 

				}
				break;
			case 206 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2106: KW_BEFORE
				{
				mKW_BEFORE(); 

				}
				break;
			case 207 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2116: KW_BETWEEN
				{
				mKW_BETWEEN(); 

				}
				break;
			case 208 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2127: KW_BOTH
				{
				mKW_BOTH(); 

				}
				break;
			case 209 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2135: KW_BINARY
				{
				mKW_BINARY(); 

				}
				break;
			case 210 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2145: KW_CROSS
				{
				mKW_CROSS(); 

				}
				break;
			case 211 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2154: KW_CONTINUE
				{
				mKW_CONTINUE(); 

				}
				break;
			case 212 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2166: KW_CURSOR
				{
				mKW_CURSOR(); 

				}
				break;
			case 213 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2176: KW_TRIGGER
				{
				mKW_TRIGGER(); 

				}
				break;
			case 214 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2187: KW_RECORDREADER
				{
				mKW_RECORDREADER(); 

				}
				break;
			case 215 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2203: KW_RECORDWRITER
				{
				mKW_RECORDWRITER(); 

				}
				break;
			case 216 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2219: KW_SEMI
				{
				mKW_SEMI(); 

				}
				break;
			case 217 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2227: KW_LATERAL
				{
				mKW_LATERAL(); 

				}
				break;
			case 218 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2238: KW_TOUCH
				{
				mKW_TOUCH(); 

				}
				break;
			case 219 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2247: KW_ARCHIVE
				{
				mKW_ARCHIVE(); 

				}
				break;
			case 220 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2258: KW_UNARCHIVE
				{
				mKW_UNARCHIVE(); 

				}
				break;
			case 221 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2271: KW_COMPUTE
				{
				mKW_COMPUTE(); 

				}
				break;
			case 222 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2282: KW_STATISTICS
				{
				mKW_STATISTICS(); 

				}
				break;
			case 223 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2296: KW_USE
				{
				mKW_USE(); 

				}
				break;
			case 224 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2303: KW_OPTION
				{
				mKW_OPTION(); 

				}
				break;
			case 225 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2313: KW_CONCATENATE
				{
				mKW_CONCATENATE(); 

				}
				break;
			case 226 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2328: KW_SHOW_DATABASE
				{
				mKW_SHOW_DATABASE(); 

				}
				break;
			case 227 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2345: KW_UPDATE
				{
				mKW_UPDATE(); 

				}
				break;
			case 228 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2355: KW_RESTRICT
				{
				mKW_RESTRICT(); 

				}
				break;
			case 229 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2367: KW_CASCADE
				{
				mKW_CASCADE(); 

				}
				break;
			case 230 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2378: KW_SKEWED
				{
				mKW_SKEWED(); 

				}
				break;
			case 231 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2388: KW_ROLLUP
				{
				mKW_ROLLUP(); 

				}
				break;
			case 232 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2398: KW_CUBE
				{
				mKW_CUBE(); 

				}
				break;
			case 233 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2406: KW_DIRECTORIES
				{
				mKW_DIRECTORIES(); 

				}
				break;
			case 234 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2421: KW_FOR
				{
				mKW_FOR(); 

				}
				break;
			case 235 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2428: KW_WINDOW
				{
				mKW_WINDOW(); 

				}
				break;
			case 236 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2438: KW_UNBOUNDED
				{
				mKW_UNBOUNDED(); 

				}
				break;
			case 237 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2451: KW_PRECEDING
				{
				mKW_PRECEDING(); 

				}
				break;
			case 238 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2464: KW_FOLLOWING
				{
				mKW_FOLLOWING(); 

				}
				break;
			case 239 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2477: KW_CURRENT
				{
				mKW_CURRENT(); 

				}
				break;
			case 240 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2488: KW_CURRENT_DATE
				{
				mKW_CURRENT_DATE(); 

				}
				break;
			case 241 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2504: KW_CURRENT_TIMESTAMP
				{
				mKW_CURRENT_TIMESTAMP(); 

				}
				break;
			case 242 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2525: KW_LESS
				{
				mKW_LESS(); 

				}
				break;
			case 243 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2533: KW_MORE
				{
				mKW_MORE(); 

				}
				break;
			case 244 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2541: KW_OVER
				{
				mKW_OVER(); 

				}
				break;
			case 245 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2549: KW_GROUPING
				{
				mKW_GROUPING(); 

				}
				break;
			case 246 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2561: KW_SETS
				{
				mKW_SETS(); 

				}
				break;
			case 247 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2569: KW_TRUNCATE
				{
				mKW_TRUNCATE(); 

				}
				break;
			case 248 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2581: KW_NOSCAN
				{
				mKW_NOSCAN(); 

				}
				break;
			case 249 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2591: KW_USER
				{
				mKW_USER(); 

				}
				break;
			case 250 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2599: KW_ROLE
				{
				mKW_ROLE(); 

				}
				break;
			case 251 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2607: KW_ROLES
				{
				mKW_ROLES(); 

				}
				break;
			case 252 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2616: KW_INNER
				{
				mKW_INNER(); 

				}
				break;
			case 253 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2625: KW_EXCHANGE
				{
				mKW_EXCHANGE(); 

				}
				break;
			case 254 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2637: KW_URI
				{
				mKW_URI(); 

				}
				break;
			case 255 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2644: KW_SERVER
				{
				mKW_SERVER(); 

				}
				break;
			case 256 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2654: KW_ADMIN
				{
				mKW_ADMIN(); 

				}
				break;
			case 257 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2663: KW_OWNER
				{
				mKW_OWNER(); 

				}
				break;
			case 258 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2672: KW_PRINCIPALS
				{
				mKW_PRINCIPALS(); 

				}
				break;
			case 259 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2686: KW_COMPACT
				{
				mKW_COMPACT(); 

				}
				break;
			case 260 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2697: KW_COMPACTIONS
				{
				mKW_COMPACTIONS(); 

				}
				break;
			case 261 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2712: KW_TRANSACTIONS
				{
				mKW_TRANSACTIONS(); 

				}
				break;
			case 262 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2728: KW_TRANSACTIONAL
				{
				mKW_TRANSACTIONAL(); 

				}
				break;
			case 263 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2745: KW_REWRITE
				{
				mKW_REWRITE(); 

				}
				break;
			case 264 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2756: KW_AUTHORIZATION
				{
				mKW_AUTHORIZATION(); 

				}
				break;
			case 265 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2773: KW_REOPTIMIZATION
				{
				mKW_REOPTIMIZATION(); 

				}
				break;
			case 266 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2791: KW_CONF
				{
				mKW_CONF(); 

				}
				break;
			case 267 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2799: KW_VALUES
				{
				mKW_VALUES(); 

				}
				break;
			case 268 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2809: KW_RELOAD
				{
				mKW_RELOAD(); 

				}
				break;
			case 269 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2819: KW_YEAR
				{
				mKW_YEAR(); 

				}
				break;
			case 270 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2827: KW_QUERY
				{
				mKW_QUERY(); 

				}
				break;
			case 271 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2836: KW_QUARTER
				{
				mKW_QUARTER(); 

				}
				break;
			case 272 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2847: KW_MONTH
				{
				mKW_MONTH(); 

				}
				break;
			case 273 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2856: KW_WEEK
				{
				mKW_WEEK(); 

				}
				break;
			case 274 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2864: KW_DAY
				{
				mKW_DAY(); 

				}
				break;
			case 275 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2871: KW_DOW
				{
				mKW_DOW(); 

				}
				break;
			case 276 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2878: KW_HOUR
				{
				mKW_HOUR(); 

				}
				break;
			case 277 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2886: KW_MINUTE
				{
				mKW_MINUTE(); 

				}
				break;
			case 278 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2896: KW_SECOND
				{
				mKW_SECOND(); 

				}
				break;
			case 279 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2906: KW_START
				{
				mKW_START(); 

				}
				break;
			case 280 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2915: KW_TRANSACTION
				{
				mKW_TRANSACTION(); 

				}
				break;
			case 281 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2930: KW_COMMIT
				{
				mKW_COMMIT(); 

				}
				break;
			case 282 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2940: KW_ROLLBACK
				{
				mKW_ROLLBACK(); 

				}
				break;
			case 283 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2952: KW_WORK
				{
				mKW_WORK(); 

				}
				break;
			case 284 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2960: KW_ONLY
				{
				mKW_ONLY(); 

				}
				break;
			case 285 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2968: KW_WRITE
				{
				mKW_WRITE(); 

				}
				break;
			case 286 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2977: KW_ISOLATION
				{
				mKW_ISOLATION(); 

				}
				break;
			case 287 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2990: KW_LEVEL
				{
				mKW_LEVEL(); 

				}
				break;
			case 288 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2999: KW_SNAPSHOT
				{
				mKW_SNAPSHOT(); 

				}
				break;
			case 289 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3011: KW_AUTOCOMMIT
				{
				mKW_AUTOCOMMIT(); 

				}
				break;
			case 290 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3025: KW_CACHE
				{
				mKW_CACHE(); 

				}
				break;
			case 291 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3034: KW_PRIMARY
				{
				mKW_PRIMARY(); 

				}
				break;
			case 292 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3045: KW_FOREIGN
				{
				mKW_FOREIGN(); 

				}
				break;
			case 293 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3056: KW_REFERENCES
				{
				mKW_REFERENCES(); 

				}
				break;
			case 294 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3070: KW_CONSTRAINT
				{
				mKW_CONSTRAINT(); 

				}
				break;
			case 295 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3084: KW_FORCE
				{
				mKW_FORCE(); 

				}
				break;
			case 296 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3093: KW_ENFORCED
				{
				mKW_ENFORCED(); 

				}
				break;
			case 297 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3105: KW_VALIDATE
				{
				mKW_VALIDATE(); 

				}
				break;
			case 298 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3117: KW_NOVALIDATE
				{
				mKW_NOVALIDATE(); 

				}
				break;
			case 299 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3131: KW_RELY
				{
				mKW_RELY(); 

				}
				break;
			case 300 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3139: KW_NORELY
				{
				mKW_NORELY(); 

				}
				break;
			case 301 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3149: KW_UNIQUE
				{
				mKW_UNIQUE(); 

				}
				break;
			case 302 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3159: KW_KEY
				{
				mKW_KEY(); 

				}
				break;
			case 303 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3166: KW_ABORT
				{
				mKW_ABORT(); 

				}
				break;
			case 304 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3175: KW_EXTRACT
				{
				mKW_EXTRACT(); 

				}
				break;
			case 305 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3186: KW_FLOOR
				{
				mKW_FLOOR(); 

				}
				break;
			case 306 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3195: KW_MERGE
				{
				mKW_MERGE(); 

				}
				break;
			case 307 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3204: KW_MATCHED
				{
				mKW_MATCHED(); 

				}
				break;
			case 308 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3215: KW_REPL
				{
				mKW_REPL(); 

				}
				break;
			case 309 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3223: KW_DUMP
				{
				mKW_DUMP(); 

				}
				break;
			case 310 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3231: KW_STATUS
				{
				mKW_STATUS(); 

				}
				break;
			case 311 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3241: KW_VECTORIZATION
				{
				mKW_VECTORIZATION(); 

				}
				break;
			case 312 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3258: KW_SUMMARY
				{
				mKW_SUMMARY(); 

				}
				break;
			case 313 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3269: KW_OPERATOR
				{
				mKW_OPERATOR(); 

				}
				break;
			case 314 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3281: KW_EXPRESSION
				{
				mKW_EXPRESSION(); 

				}
				break;
			case 315 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3295: KW_DETAIL
				{
				mKW_DETAIL(); 

				}
				break;
			case 316 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3305: KW_WAIT
				{
				mKW_WAIT(); 

				}
				break;
			case 317 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3313: KW_RESOURCE
				{
				mKW_RESOURCE(); 

				}
				break;
			case 318 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3325: KW_PLAN
				{
				mKW_PLAN(); 

				}
				break;
			case 319 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3333: KW_QUERY_PARALLELISM
				{
				mKW_QUERY_PARALLELISM(); 

				}
				break;
			case 320 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3354: KW_PLANS
				{
				mKW_PLANS(); 

				}
				break;
			case 321 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3363: KW_ACTIVATE
				{
				mKW_ACTIVATE(); 

				}
				break;
			case 322 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3375: KW_DEFAULT
				{
				mKW_DEFAULT(); 

				}
				break;
			case 323 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3386: KW_CHECK
				{
				mKW_CHECK(); 

				}
				break;
			case 324 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3395: KW_POOL
				{
				mKW_POOL(); 

				}
				break;
			case 325 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3403: KW_MOVE
				{
				mKW_MOVE(); 

				}
				break;
			case 326 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3411: KW_DO
				{
				mKW_DO(); 

				}
				break;
			case 327 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3417: KW_ALLOC_FRACTION
				{
				mKW_ALLOC_FRACTION(); 

				}
				break;
			case 328 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3435: KW_SCHEDULING_POLICY
				{
				mKW_SCHEDULING_POLICY(); 

				}
				break;
			case 329 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3456: KW_PATH
				{
				mKW_PATH(); 

				}
				break;
			case 330 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3464: KW_MAPPING
				{
				mKW_MAPPING(); 

				}
				break;
			case 331 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3475: KW_WORKLOAD
				{
				mKW_WORKLOAD(); 

				}
				break;
			case 332 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3487: KW_MANAGEMENT
				{
				mKW_MANAGEMENT(); 

				}
				break;
			case 333 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3501: KW_ACTIVE
				{
				mKW_ACTIVE(); 

				}
				break;
			case 334 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3511: KW_UNMANAGED
				{
				mKW_UNMANAGED(); 

				}
				break;
			case 335 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3524: KW_APPLICATION
				{
				mKW_APPLICATION(); 

				}
				break;
			case 336 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3539: KW_SYNC
				{
				mKW_SYNC(); 

				}
				break;
			case 337 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3547: KW_COST
				{
				mKW_COST(); 

				}
				break;
			case 338 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3555: KW_JOINCOST
				{
				mKW_JOINCOST(); 

				}
				break;
			case 339 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3567: DOT
				{
				mDOT(); 

				}
				break;
			case 340 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3571: COLON
				{
				mCOLON(); 

				}
				break;
			case 341 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3577: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 342 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3583: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 343 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3593: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 344 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3600: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 345 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3607: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 346 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3615: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 347 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3623: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 348 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3630: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 349 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3637: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 350 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3643: EQUAL_NS
				{
				mEQUAL_NS(); 

				}
				break;
			case 351 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3652: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 352 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3661: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); 

				}
				break;
			case 353 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3679: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 354 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3688: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); 

				}
				break;
			case 355 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3709: GREATERTHAN
				{
				mGREATERTHAN(); 

				}
				break;
			case 356 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3721: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 357 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3728: PLUS
				{
				mPLUS(); 

				}
				break;
			case 358 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3733: MINUS
				{
				mMINUS(); 

				}
				break;
			case 359 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3739: STAR
				{
				mSTAR(); 

				}
				break;
			case 360 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3744: MOD
				{
				mMOD(); 

				}
				break;
			case 361 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3748: DIV
				{
				mDIV(); 

				}
				break;
			case 362 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3752: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 363 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3762: TILDE
				{
				mTILDE(); 

				}
				break;
			case 364 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3768: BITWISEOR
				{
				mBITWISEOR(); 

				}
				break;
			case 365 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3778: CONCATENATE
				{
				mCONCATENATE(); 

				}
				break;
			case 366 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3790: BITWISEXOR
				{
				mBITWISEXOR(); 

				}
				break;
			case 367 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3801: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 368 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3810: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 369 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3817: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 370 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3831: CharSetLiteral
				{
				mCharSetLiteral(); 

				}
				break;
			case 371 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3846: IntegralLiteral
				{
				mIntegralLiteral(); 

				}
				break;
			case 372 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3862: NumberLiteral
				{
				mNumberLiteral(); 

				}
				break;
			case 373 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3876: ByteLengthLiteral
				{
				mByteLengthLiteral(); 

				}
				break;
			case 374 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3894: Number
				{
				mNumber(); 

				}
				break;
			case 375 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3901: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 376 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3912: CharSetName
				{
				mCharSetName(); 

				}
				break;
			case 377 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3924: WS
				{
				mWS(); 

				}
				break;
			case 378 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3927: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 379 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3940: QUERY_HINT
				{
				mQUERY_HINT(); 

				}
				break;

		}
	}


	protected DFA29 dfa29 = new DFA29(this);
	protected DFA34 dfa34 = new DFA34(this);
	static final String DFA29_eotS =
		"\7\uffff";
	static final String DFA29_eofS =
		"\7\uffff";
	static final String DFA29_minS =
		"\1\60\1\uffff\1\0\1\uffff\2\0\1\uffff";
	static final String DFA29_maxS =
		"\1\172\1\uffff\1\uffff\1\uffff\1\uffff\1\0\1\uffff";
	static final String DFA29_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\2\uffff\1\3";
	static final String DFA29_specialS =
		"\2\uffff\1\1\1\uffff\1\2\1\0\1\uffff}>";
	static final String[] DFA29_transitionS = {
			"\12\1\7\uffff\32\1\5\uffff\1\2\32\1",
			"",
			"\41\3\1\4\2\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
			"\1\3\35\4\uff82\3",
			"",
			"\41\3\1\4\2\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
			"\1\5\35\4\uff82\3",
			"\1\uffff",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "508:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA29_5 = input.LA(1);
						 
						int index29_5 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowQuotedId())) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_5);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA29_2 = input.LA(1);
						s = -1;
						if ( ((LA29_2 >= '\u0000' && LA29_2 <= ' ')||(LA29_2 >= '\"' && LA29_2 <= '#')||(LA29_2 >= '%' && LA29_2 <= '\'')||LA29_2==','||LA29_2=='/'||(LA29_2 >= ':' && LA29_2 <= '>')||LA29_2=='@'||LA29_2=='\\'||LA29_2=='`'||(LA29_2 >= '~' && LA29_2 <= '\uFFFF')) ) {s = 3;}
						else if ( (LA29_2=='!'||LA29_2=='$'||(LA29_2 >= '(' && LA29_2 <= '+')||(LA29_2 >= '-' && LA29_2 <= '.')||(LA29_2 >= '0' && LA29_2 <= '9')||LA29_2=='?'||(LA29_2 >= 'A' && LA29_2 <= '[')||(LA29_2 >= ']' && LA29_2 <= '_')||(LA29_2 >= 'a' && LA29_2 <= '}')) ) {s = 4;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA29_4 = input.LA(1);
						s = -1;
						if ( (LA29_4=='`') ) {s = 5;}
						else if ( (LA29_4=='!'||LA29_4=='$'||(LA29_4 >= '(' && LA29_4 <= '+')||(LA29_4 >= '-' && LA29_4 <= '.')||(LA29_4 >= '0' && LA29_4 <= '9')||LA29_4=='?'||(LA29_4 >= 'A' && LA29_4 <= '[')||(LA29_4 >= ']' && LA29_4 <= '_')||(LA29_4 >= 'a' && LA29_4 <= '}')) ) {s = 4;}
						else if ( ((LA29_4 >= '\u0000' && LA29_4 <= ' ')||(LA29_4 >= '\"' && LA29_4 <= '#')||(LA29_4 >= '%' && LA29_4 <= '\'')||LA29_4==','||LA29_4=='/'||(LA29_4 >= ':' && LA29_4 <= '>')||LA29_4=='@'||LA29_4=='\\'||(LA29_4 >= '~' && LA29_4 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 29, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA34_eotS =
		"\1\uffff\5\67\1\134\22\67\1\u00b2\2\67\13\uffff\1\u00b6\1\u00b8\1\u00ba"+
		"\1\uffff\1\u00bc\4\uffff\1\u00be\4\uffff\2\u00ca\3\uffff\2\67\1\u00d3"+
		"\15\67\1\u00eb\11\67\1\u00fd\2\67\1\u0101\1\u0103\2\67\2\uffff\4\67\1"+
		"\u0113\1\u0119\1\67\1\u011c\12\67\1\u0136\3\67\1\u013b\73\67\4\uffff\2"+
		"\67\1\u01ad\13\uffff\1\u01af\2\uffff\1\u01af\1\67\1\u01b2\2\u00ca\1\67"+
		"\1\uffff\1\u01b5\2\u01b9\5\67\1\uffff\16\67\1\u01d2\2\67\1\u01d6\1\67"+
		"\1\u01d8\1\u01d9\1\67\1\u01db\1\uffff\3\67\1\u01df\6\67\1\134\6\67\1\uffff"+
		"\1\67\1\u01f0\1\67\1\uffff\1\67\1\uffff\17\67\1\uffff\3\67\1\u0209\1\67"+
		"\1\uffff\2\67\1\uffff\10\67\1\u021a\3\67\1\u021f\7\67\1\u022b\1\67\1\u0230"+
		"\2\67\1\uffff\4\67\1\uffff\23\67\1\u024d\12\67\1\u025b\14\67\1\u026b\1"+
		"\u026d\1\67\1\u026f\13\67\1\u027d\16\67\1\u0290\16\67\1\u02a8\5\67\1\u02b1"+
		"\14\67\1\u02c1\4\67\5\uffff\1\u02c6\1\uffff\1\u00ca\3\uffff\1\u00ca\1"+
		"\u01b5\1\uffff\1\u02cb\6\67\1\u02d3\3\67\1\u02d7\1\67\1\u02d9\1\u02da"+
		"\3\67\1\u02df\5\67\1\uffff\3\67\1\uffff\1\67\2\uffff\1\67\1\uffff\3\67"+
		"\1\uffff\6\67\1\u02f3\3\67\1\u02f8\2\67\1\u02fc\2\67\1\uffff\1\u02ff\4"+
		"\67\1\u0304\2\67\1\u0307\1\67\1\u0309\1\u030a\2\67\1\u030f\1\u0310\1\67"+
		"\1\u0312\5\67\1\u0319\1\uffff\20\67\1\uffff\1\67\1\u032c\1\u032e\1\67"+
		"\1\uffff\13\67\1\uffff\1\u033d\1\u033f\1\u0230\1\67\1\uffff\1\u0341\2"+
		"\67\1\u0344\3\67\1\u0348\6\67\1\u0350\1\67\1\u0352\1\67\1\u0354\1\67\1"+
		"\u0357\1\u0359\1\67\1\u035b\3\67\1\u035f\1\uffff\1\u0360\1\67\1\u0363"+
		"\1\67\1\u0366\10\67\1\uffff\3\67\1\u0374\4\67\1\u0379\5\67\1\u037f\1\uffff"+
		"\1\67\1\uffff\1\67\1\uffff\6\67\1\u0389\1\67\1\u038b\1\u038d\1\67\1\u038f"+
		"\1\u0391\1\uffff\3\67\1\u0397\4\67\1\u039d\6\67\1\u03a4\1\67\1\u03a6\1"+
		"\uffff\1\67\1\u03aa\10\67\1\u03b5\1\67\1\u03b7\4\67\1\u03bc\1\67\1\u03be"+
		"\1\u03bf\2\67\1\uffff\2\67\1\u03c4\1\u03c5\4\67\1\uffff\5\67\1\u03d0\1"+
		"\67\1\u03d2\1\u03d3\3\67\1\u03d8\1\67\1\u03da\1\uffff\1\u03db\1\u03dd"+
		"\2\67\2\uffff\2\u00ca\1\67\1\uffff\3\67\1\u03e5\1\u03e6\2\67\1\uffff\3"+
		"\67\1\uffff\1\u03ec\2\uffff\1\67\1\u03ee\2\67\1\uffff\1\u03f1\1\u03f2"+
		"\2\67\1\u03f5\1\67\1\u03f7\1\67\1\u03f9\1\67\1\u03fb\1\u03fc\1\67\1\u03fe"+
		"\2\67\1\u0401\2\67\1\uffff\3\67\1\u0408\1\uffff\1\67\1\u040a\1\67\1\uffff"+
		"\1\u040c\1\67\1\uffff\3\67\1\u0411\1\uffff\1\u0412\1\u0413\1\uffff\1\67"+
		"\2\uffff\1\u0415\1\u0416\1\67\1\u0418\2\uffff\1\67\1\uffff\1\67\1\u041c"+
		"\4\67\1\uffff\1\u0423\2\67\1\u0426\16\67\1\uffff\1\67\1\uffff\3\67\1\u0439"+
		"\12\67\1\uffff\1\67\1\uffff\1\67\1\uffff\2\67\1\uffff\1\u0449\1\u044a"+
		"\1\67\1\uffff\6\67\1\u0350\1\uffff\1\u0452\1\uffff\1\u0453\1\uffff\1\67"+
		"\1\u0357\1\uffff\1\67\1\uffff\1\u0456\1\uffff\1\67\1\u0459\1\67\2\uffff"+
		"\2\67\1\uffff\2\67\1\uffff\7\67\1\u0466\5\67\1\uffff\1\67\1\u046e\1\u046f"+
		"\1\67\1\uffff\4\67\1\u0475\1\uffff\11\67\1\uffff\1\67\1\uffff\1\u0480"+
		"\1\uffff\1\u0481\1\uffff\1\67\1\uffff\1\u0483\4\67\1\uffff\4\67\1\u048c"+
		"\1\uffff\6\67\1\uffff\1\67\1\uffff\2\67\1\u0496\1\uffff\1\u0497\1\u0498"+
		"\10\67\1\uffff\1\67\1\uffff\2\67\1\u04a4\1\67\1\uffff\1\u04a6\2\uffff"+
		"\1\67\1\u04a8\2\67\2\uffff\1\67\1\u04ac\2\67\1\u04af\3\67\1\u04b3\1\67"+
		"\1\uffff\1\u04b6\2\uffff\3\67\1\u04ba\1\uffff\1\67\2\uffff\1\u03dd\1\uffff"+
		"\1\u04bd\5\67\1\u04c4\2\uffff\5\67\1\uffff\1\67\1\uffff\1\u04cb\1\67\2"+
		"\uffff\1\u04ce\1\67\1\uffff\1\67\1\uffff\1\67\1\uffff\1\67\2\uffff\1\67"+
		"\1\uffff\2\67\1\uffff\1\67\1\u04d7\1\67\1\u04d9\1\67\1\u04db\1\uffff\1"+
		"\67\1\uffff\1\67\1\uffff\1\67\1\u04e0\1\u04e1\1\67\3\uffff\1\67\2\uffff"+
		"\1\67\1\uffff\1\67\1\u04e6\1\67\1\uffff\1\u04e8\5\67\1\uffff\1\u04ee\1"+
		"\67\1\uffff\1\67\1\u04f1\1\u04f2\2\67\1\u04f5\6\67\1\u04fc\4\67\1\u0501"+
		"\1\uffff\4\67\1\u0506\7\67\1\u050e\2\67\2\uffff\1\67\1\u0512\1\u0513\1"+
		"\u0515\1\u0516\1\67\1\u0518\2\uffff\1\u0519\1\67\1\uffff\1\u051b\1\67"+
		"\1\uffff\1\u051d\1\u051f\1\67\1\u0521\1\u0522\1\67\1\u0524\1\u0525\1\67"+
		"\1\u0527\1\67\1\u0529\1\uffff\1\u052b\1\67\1\u052d\2\67\1\u0531\1\67\2"+
		"\uffff\1\67\1\u0534\3\67\1\uffff\1\67\1\u0539\10\67\2\uffff\1\67\1\uffff"+
		"\1\67\1\u0544\2\67\1\u0547\1\u0548\1\u0549\1\u054a\1\uffff\5\67\1\u0551"+
		"\1\67\1\u0553\1\67\3\uffff\1\u0556\2\67\1\u0559\6\67\1\u0560\1\uffff\1"+
		"\u0561\1\uffff\1\67\1\uffff\1\u0563\2\67\1\uffff\2\67\1\uffff\3\67\1\uffff"+
		"\1\u056c\1\u04b6\1\uffff\1\67\1\u056e\1\67\1\uffff\2\67\1\uffff\4\67\1"+
		"\u0576\1\67\1\uffff\1\u0578\5\67\1\uffff\2\67\1\uffff\1\u0580\2\67\1\u0583"+
		"\1\u0584\3\67\1\uffff\1\67\1\uffff\1\67\1\uffff\1\u021f\3\67\2\uffff\1"+
		"\67\1\u058e\1\67\1\u0590\1\uffff\1\u0591\1\uffff\2\67\1\u0209\2\67\1\uffff"+
		"\2\67\2\uffff\2\67\1\uffff\1\u059a\3\67\1\u059e\1\u059f\1\uffff\2\67\1"+
		"\u021f\1\67\1\uffff\2\67\1\u05a5\1\u05a6\1\uffff\2\67\1\u05a9\4\67\1\uffff"+
		"\2\67\1\u05b0\2\uffff\1\u05b1\2\uffff\1\u05b2\2\uffff\1\67\1\uffff\1\67"+
		"\1\uffff\1\u051f\1\uffff\1\67\2\uffff\1\67\2\uffff\1\67\1\uffff\1\67\1"+
		"\uffff\1\u05b9\1\uffff\1\67\1\uffff\1\67\1\u05bc\1\67\1\uffff\2\67\1\uffff"+
		"\4\67\1\uffff\5\67\1\u05c9\1\67\1\u05cb\1\67\1\u05cd\1\uffff\1\67\1\u05cf"+
		"\4\uffff\4\67\1\u05d4\1\67\1\uffff\1\67\1\uffff\1\67\1\u05d8\1\uffff\1"+
		"\67\1\u05da\1\uffff\1\u05db\1\u05dd\3\67\1\u05e3\2\uffff\1\u05e4\1\uffff"+
		"\1\u05e6\1\67\1\u05e8\1\u05e9\1\67\1\u05eb\1\67\1\u056c\1\uffff\1\u05ed"+
		"\1\uffff\3\67\1\u05f1\1\u05f2\2\67\1\uffff\1\67\1\uffff\4\67\1\u05fb\2"+
		"\67\1\uffff\2\67\2\uffff\2\67\1\u0602\5\67\1\u0608\1\uffff\1\u0609\2\uffff"+
		"\2\67\1\u060c\4\67\1\u0611\1\uffff\1\67\1\u0613\1\u0614\2\uffff\1\u0615"+
		"\1\u0616\2\67\1\u0619\2\uffff\1\u061a\1\67\1\uffff\1\67\1\u061f\1\u0620"+
		"\2\67\1\u0623\3\uffff\1\u0624\2\67\1\u0627\2\67\1\uffff\1\67\1\u062b\1"+
		"\uffff\2\67\1\u062e\4\67\1\u0633\4\67\1\uffff\1\67\1\uffff\1\u0639\1\uffff"+
		"\1\67\1\uffff\2\67\1\u063d\1\u063e\1\uffff\2\67\1\u0641\1\uffff\1\67\2"+
		"\uffff\1\67\1\uffff\1\u0644\4\67\2\uffff\1\67\1\uffff\1\u064b\2\uffff"+
		"\1\67\1\uffff\1\67\1\uffff\1\u064e\2\67\2\uffff\1\u0651\2\67\1\u0655\1"+
		"\67\1\u0657\1\67\1\u0659\1\uffff\1\67\1\u065b\1\u065c\3\67\1\uffff\2\67"+
		"\1\u0662\2\67\2\uffff\2\67\1\uffff\1\u0667\1\u0668\1\67\1\u066a\1\uffff"+
		"\1\67\4\uffff\1\u066c\1\67\2\uffff\1\67\1\u066f\1\67\1\u0671\2\uffff\1"+
		"\u0672\1\67\2\uffff\2\67\1\uffff\3\67\1\uffff\1\67\1\u067a\1\uffff\1\u067b"+
		"\1\u067c\1\u067d\1\67\1\uffff\1\u067f\1\u0680\1\u0681\1\67\1\u0685\1\uffff"+
		"\3\67\2\uffff\2\67\1\uffff\2\67\1\uffff\2\67\1\u068f\3\67\1\uffff\2\67"+
		"\1\uffff\2\67\1\uffff\3\67\1\uffff\1\u069a\1\uffff\1\67\1\uffff\1\u069c"+
		"\2\uffff\2\67\1\u069f\1\67\1\u06a1\1\uffff\4\67\2\uffff\1\67\1\uffff\1"+
		"\u06a7\1\uffff\1\u06a8\1\u06aa\1\uffff\1\67\2\uffff\4\67\1\u06b0\1\67"+
		"\1\u06b2\4\uffff\1\67\3\uffff\1\u06b4\1\u06b5\1\67\1\uffff\4\67\1\u06bb"+
		"\1\u06bc\2\67\1\u06bf\1\uffff\4\67\1\u06c4\2\67\1\u06c9\1\u06ca\1\67\1"+
		"\uffff\1\67\1\uffff\2\67\1\uffff\1\u06cf\1\uffff\2\67\1\u06d2\1\u06d3"+
		"\1\67\2\uffff\1\u06d5\1\uffff\1\u06d6\3\67\1\u06da\1\uffff\1\67\1\uffff"+
		"\1\67\2\uffff\1\u06dd\1\u06de\3\67\2\uffff\1\u06e2\1\u06e3\1\uffff\4\67"+
		"\1\uffff\2\67\1\u06ea\1\67\2\uffff\4\67\1\uffff\1\u06f0\1\u06f1\2\uffff"+
		"\1\67\2\uffff\1\u06f3\2\67\1\uffff\1\67\1\u06f7\2\uffff\1\u06f8\1\u06f9"+
		"\1\67\2\uffff\1\67\1\u06fc\1\67\1\u06fe\2\67\1\uffff\1\u0701\1\67\1\u0703"+
		"\1\67\1\u0705\2\uffff\1\u0706\1\uffff\1\67\1\u0708\1\67\3\uffff\1\67\1"+
		"\u070b\1\uffff\1\67\1\uffff\1\u070d\1\67\1\uffff\1\67\1\uffff\1\u0710"+
		"\2\uffff\1\67\1\uffff\1\67\1\u0713\1\uffff\1\67\1\uffff\2\67\1\uffff\1"+
		"\u0717\1\67\1\uffff\2\67\1\u071b\1\uffff\3\67\1\uffff\1\u071f\1\u0720"+
		"\1\u0721\3\uffff";
	static final String DFA34_eofS =
		"\u0722\uffff";
	static final String DFA34_minS =
		"\1\11\2\101\1\102\1\117\1\106\1\75\1\101\1\104\1\114\1\101\1\122\1\105"+
		"\2\101\1\103\1\116\5\101\1\117\1\101\3\105\1\125\13\uffff\2\75\1\52\1"+
		"\uffff\1\55\4\uffff\1\174\2\uffff\2\0\2\56\3\uffff\1\101\1\102\1\60\2"+
		"\115\1\114\1\105\1\114\1\117\1\114\1\105\1\117\1\114\1\124\1\114\1\101"+
		"\1\60\1\124\1\103\1\104\1\124\1\117\1\124\1\120\1\116\1\114\1\60\1\105"+
		"\1\124\2\60\1\105\1\116\2\uffff\1\113\1\123\1\106\1\101\2\60\1\120\1\60"+
		"\1\105\1\130\2\103\1\101\1\123\1\102\1\122\1\124\1\117\1\60\1\120\1\115"+
		"\1\101\1\60\1\117\1\107\1\103\1\106\1\126\1\125\1\105\1\116\1\105\1\122"+
		"\2\111\1\103\1\101\1\122\2\101\1\110\1\114\1\105\1\101\1\115\1\116\1\101"+
		"\1\105\1\103\1\104\1\111\1\105\2\122\1\101\1\122\1\117\1\111\1\122\1\107"+
		"\1\101\1\114\1\111\1\116\1\114\1\125\1\105\1\101\1\103\1\117\1\102\1\103"+
		"\1\122\1\103\3\116\1\114\1\105\1\103\1\131\1\114\4\uffff\2\101\1\76\11"+
		"\uffff\2\0\1\42\2\0\1\42\2\60\1\56\1\60\1\53\1\uffff\3\60\1\105\1\116"+
		"\1\107\1\114\1\103\1\uffff\1\131\1\105\1\115\2\120\1\116\1\123\1\115\1"+
		"\114\1\103\1\123\1\114\1\105\1\101\1\60\1\114\1\103\1\60\1\105\2\60\1"+
		"\114\1\60\1\uffff\1\105\1\101\1\110\1\60\1\111\1\110\1\122\1\111\1\114"+
		"\1\105\1\60\1\103\1\101\1\105\1\114\2\105\1\uffff\1\122\1\60\1\131\1\uffff"+
		"\1\123\1\uffff\1\111\1\122\3\105\1\111\1\124\1\105\1\124\1\123\1\105\1"+
		"\101\1\104\1\111\1\107\1\uffff\2\105\1\101\1\60\1\105\1\uffff\1\117\1"+
		"\114\1\uffff\1\115\1\120\1\123\1\105\1\114\1\105\1\101\1\102\1\60\1\117"+
		"\1\105\1\103\1\60\1\105\1\125\1\105\3\101\1\105\1\60\1\101\1\60\1\120"+
		"\1\102\1\uffff\1\122\1\120\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101"+
		"\1\113\1\117\1\127\1\111\1\122\1\116\1\114\1\110\1\104\2\113\2\124\1\105"+
		"\1\104\1\60\1\111\1\117\1\127\1\122\1\124\1\114\1\105\2\122\1\105\1\60"+
		"\1\127\1\120\1\115\1\103\1\117\1\105\2\117\1\122\1\117\1\101\1\116\2\60"+
		"\1\101\1\60\2\103\1\115\1\124\1\110\1\103\1\123\1\116\1\107\1\114\1\116"+
		"\1\60\1\110\1\125\2\101\1\125\1\105\1\117\1\104\2\117\1\122\1\120\1\117"+
		"\1\105\1\60\1\105\1\113\1\107\1\114\1\115\1\103\1\124\1\123\1\101\1\123"+
		"\1\116\2\103\1\110\1\60\1\122\1\105\1\113\1\101\1\107\1\60\1\122\1\103"+
		"\1\101\1\125\1\105\1\124\2\105\1\103\1\111\1\127\1\124\1\60\1\114\3\122"+
		"\2\uffff\1\0\1\uffff\1\0\1\60\1\uffff\1\60\1\53\1\uffff\3\60\1\uffff\1"+
		"\60\1\103\1\123\1\107\1\105\1\110\1\111\1\60\1\111\1\117\1\122\1\60\1"+
		"\105\2\60\2\124\1\104\1\60\1\124\1\122\1\101\1\111\1\105\1\uffff\1\117"+
		"\1\110\1\103\1\uffff\1\122\2\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff"+
		"\1\116\1\117\1\103\1\124\1\126\1\111\1\60\1\101\2\114\1\60\2\122\1\60"+
		"\1\122\1\125\1\uffff\1\60\1\105\1\117\1\101\1\122\1\60\1\123\1\124\1\60"+
		"\1\122\2\60\2\114\2\60\1\103\1\60\1\122\1\130\2\124\1\107\1\60\1\uffff"+
		"\2\122\1\101\1\123\1\122\1\124\1\120\1\125\1\101\1\122\1\101\1\105\1\116"+
		"\1\101\1\120\1\114\1\uffff\1\122\2\60\1\115\1\uffff\1\115\1\124\1\107"+
		"\1\116\1\122\1\116\1\125\2\111\1\102\1\103\1\uffff\3\60\1\106\1\uffff"+
		"\1\60\1\114\1\117\1\60\1\120\1\124\1\105\1\60\1\116\1\122\1\105\1\122"+
		"\1\105\1\116\1\60\1\105\1\60\1\105\1\60\1\117\2\60\1\105\1\60\1\103\2"+
		"\105\1\60\1\uffff\1\60\1\116\1\60\1\105\1\60\1\114\1\116\1\103\1\101\1"+
		"\105\1\111\1\124\1\104\1\uffff\1\105\1\123\1\101\1\60\1\125\1\116\1\124"+
		"\1\107\1\60\2\103\1\125\1\116\1\107\1\60\1\uffff\1\124\1\uffff\1\124\1"+
		"\uffff\3\105\1\103\1\101\1\111\1\60\1\105\2\60\1\105\2\60\1\uffff\1\124"+
		"\2\111\1\60\1\115\1\103\1\130\1\113\1\60\2\122\1\125\1\111\1\124\1\101"+
		"\1\60\1\122\1\60\1\uffff\1\102\1\60\2\105\1\115\2\105\1\101\1\111\1\101"+
		"\1\60\1\124\1\60\2\124\1\123\1\107\1\60\1\113\2\60\1\101\1\105\1\uffff"+
		"\1\117\1\105\2\60\1\104\1\105\1\117\1\111\1\uffff\1\117\1\122\1\110\1"+
		"\107\1\123\1\60\1\110\2\60\1\110\1\105\1\104\1\60\1\117\1\60\1\uffff\2"+
		"\60\1\131\1\124\1\uffff\3\60\1\104\1\uffff\2\101\1\105\2\60\1\116\1\124"+
		"\1\uffff\1\116\1\122\1\117\1\uffff\1\60\2\uffff\1\111\1\60\1\123\1\117"+
		"\1\uffff\2\60\1\124\1\107\1\60\1\127\1\60\1\137\1\60\1\132\2\60\1\126"+
		"\1\60\1\122\1\117\1\60\1\101\1\103\1\uffff\1\116\1\111\1\131\1\60\1\uffff"+
		"\1\111\1\60\1\122\1\uffff\1\60\1\124\1\uffff\1\124\1\116\1\124\1\60\1"+
		"\uffff\2\60\1\uffff\1\101\2\uffff\2\60\1\111\1\60\2\uffff\1\101\1\uffff"+
		"\1\124\1\60\1\110\1\104\1\105\1\123\1\uffff\1\60\2\124\1\60\1\117\1\123"+
		"\1\124\1\123\1\116\1\124\1\111\1\123\1\116\1\104\1\103\2\105\1\103\1\uffff"+
		"\1\111\1\uffff\1\101\1\111\1\105\1\60\1\104\1\122\1\105\2\114\1\116\1"+
		"\111\1\114\1\124\1\101\1\uffff\1\111\1\uffff\1\127\1\uffff\1\105\1\120"+
		"\1\uffff\2\60\1\101\1\uffff\1\124\1\131\1\124\2\105\1\107\1\60\1\uffff"+
		"\1\60\1\uffff\1\60\1\uffff\1\127\1\60\1\uffff\1\117\1\uffff\1\60\1\uffff"+
		"\1\124\1\60\1\122\2\uffff\2\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124"+
		"\1\115\1\104\2\123\1\60\1\101\1\125\1\104\1\110\1\122\1\uffff\1\105\2"+
		"\60\1\116\1\uffff\1\113\1\110\1\116\1\101\1\60\1\uffff\1\115\1\105\1\122"+
		"\1\123\2\104\1\111\1\122\1\124\1\uffff\1\116\1\uffff\1\60\1\uffff\1\60"+
		"\1\uffff\1\117\1\uffff\1\60\1\114\1\122\2\103\1\uffff\2\105\1\120\1\105"+
		"\1\60\1\uffff\1\104\1\111\1\122\1\124\1\111\1\104\1\uffff\1\105\1\uffff"+
		"\1\120\1\101\1\60\1\uffff\2\60\1\116\1\103\1\116\2\124\1\103\1\116\1\124"+
		"\1\uffff\1\122\1\uffff\2\105\1\60\1\105\1\uffff\1\60\2\uffff\1\104\1\60"+
		"\1\122\1\116\2\uffff\1\101\1\60\1\111\1\116\1\60\1\111\2\105\1\60\1\105"+
		"\1\uffff\1\60\2\uffff\1\101\1\123\1\101\1\60\1\uffff\1\122\2\uffff\1\60"+
		"\1\uffff\1\60\1\105\1\124\1\117\1\103\1\122\1\60\2\uffff\1\124\3\101\1"+
		"\120\1\uffff\1\117\1\uffff\1\60\1\122\2\uffff\1\60\1\116\1\uffff\1\111"+
		"\1\uffff\1\106\1\uffff\1\105\2\uffff\1\105\1\uffff\1\111\1\115\1\uffff"+
		"\1\124\1\60\1\101\1\60\1\104\1\60\1\uffff\1\103\1\uffff\1\111\1\uffff"+
		"\1\104\2\60\1\117\3\uffff\1\114\2\uffff\1\117\1\uffff\1\114\1\60\1\123"+
		"\1\uffff\1\60\1\117\2\122\1\101\1\105\1\uffff\1\60\1\111\1\uffff\1\120"+
		"\2\60\1\111\1\107\1\60\1\116\1\123\1\101\1\105\1\124\1\104\1\60\1\105"+
		"\1\102\1\114\1\124\1\60\1\uffff\2\105\1\104\1\124\1\60\1\103\1\102\1\105"+
		"\1\117\1\123\1\115\1\105\1\60\1\105\1\116\2\uffff\1\116\4\60\1\116\1\60"+
		"\2\uffff\1\60\1\101\1\uffff\1\60\1\122\1\uffff\2\60\1\101\2\60\1\116\2"+
		"\60\1\124\1\60\1\124\1\60\1\uffff\1\60\1\114\1\60\1\117\1\131\1\60\1\131"+
		"\2\uffff\1\105\1\60\1\111\1\104\1\107\1\uffff\1\105\1\60\1\126\2\111\1"+
		"\125\1\120\1\131\1\111\1\124\2\uffff\1\123\1\uffff\1\104\1\60\1\101\1"+
		"\105\4\60\1\uffff\1\122\2\103\1\105\1\115\1\60\1\116\1\60\1\103\3\uffff"+
		"\1\60\2\124\1\60\1\105\1\124\1\125\1\105\1\101\1\122\1\60\1\uffff\1\60"+
		"\1\uffff\1\105\1\uffff\1\60\2\124\1\uffff\1\116\1\107\1\uffff\1\101\1"+
		"\104\1\115\1\uffff\2\60\1\uffff\1\122\1\60\1\124\1\uffff\1\111\1\120\1"+
		"\uffff\1\122\1\105\1\122\1\124\1\60\1\115\1\uffff\1\60\1\115\1\124\1\122"+
		"\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\60\1\116\1\122\2\60\1\132\1"+
		"\115\1\105\1\uffff\1\124\1\uffff\1\101\1\uffff\1\60\1\124\1\117\1\122"+
		"\2\uffff\1\122\1\60\1\116\1\60\1\uffff\1\60\1\uffff\1\122\1\111\1\60\1"+
		"\114\1\103\1\uffff\1\117\1\105\2\uffff\1\126\1\105\1\uffff\1\60\1\111"+
		"\1\114\1\104\2\60\1\uffff\1\104\1\105\1\60\1\105\1\uffff\1\116\1\104\2"+
		"\60\1\uffff\1\124\1\125\1\60\1\122\3\105\1\uffff\1\122\1\107\1\60\2\uffff"+
		"\1\60\2\uffff\1\60\2\uffff\1\104\1\uffff\1\117\1\uffff\1\60\1\uffff\1"+
		"\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1\111\1\uffff\1\60\1\uffff\1"+
		"\111\1\uffff\1\124\1\60\1\117\1\uffff\1\120\1\104\1\uffff\1\126\2\105"+
		"\1\123\1\uffff\1\105\1\117\1\116\1\122\1\101\1\60\1\117\1\60\1\124\1\60"+
		"\1\uffff\1\124\1\60\4\uffff\1\105\1\122\1\124\1\105\1\60\1\111\1\uffff"+
		"\1\103\1\uffff\1\113\1\60\1\uffff\1\111\1\60\1\uffff\2\60\1\105\1\116"+
		"\1\111\1\60\2\uffff\1\60\1\uffff\1\60\1\101\2\60\1\114\1\60\1\105\1\60"+
		"\1\uffff\1\60\1\uffff\1\105\1\132\1\101\2\60\1\115\1\111\1\uffff\1\120"+
		"\1\uffff\1\120\1\105\1\131\1\122\1\60\1\101\1\104\1\uffff\1\107\1\101"+
		"\2\uffff\1\101\1\111\1\60\1\111\1\124\1\105\1\122\1\111\1\60\1\uffff\1"+
		"\60\2\uffff\1\115\1\126\1\60\1\124\1\116\1\122\1\105\1\60\1\uffff\1\117"+
		"\2\60\2\uffff\2\60\1\104\1\103\1\60\2\uffff\1\60\1\124\1\uffff\1\111\2"+
		"\60\1\113\1\124\1\60\3\uffff\1\60\1\120\1\101\1\60\1\102\1\103\1\uffff"+
		"\1\116\1\60\1\uffff\1\111\1\105\1\60\1\105\2\104\1\124\1\60\1\116\1\107"+
		"\1\105\1\114\1\uffff\1\116\1\uffff\1\60\1\uffff\1\111\1\uffff\1\101\1"+
		"\111\2\60\1\uffff\1\132\1\105\1\60\1\uffff\1\117\2\uffff\1\117\1\uffff"+
		"\1\60\1\101\1\116\1\104\1\124\2\uffff\1\104\1\uffff\1\60\2\uffff\1\111"+
		"\1\uffff\1\116\1\uffff\1\60\1\101\1\122\2\uffff\1\60\1\117\1\114\1\60"+
		"\1\104\1\60\1\124\1\60\1\uffff\1\124\2\60\1\103\2\124\1\uffff\1\117\1"+
		"\105\1\60\1\115\1\126\2\uffff\1\101\1\105\1\uffff\2\60\1\124\1\60\1\uffff"+
		"\1\116\4\uffff\1\60\1\131\2\uffff\1\105\1\60\1\105\1\60\2\uffff\1\60\1"+
		"\111\2\uffff\1\105\1\102\1\uffff\1\114\1\123\1\107\1\uffff\1\116\1\60"+
		"\1\uffff\3\60\1\101\1\uffff\3\60\1\123\1\60\1\uffff\1\117\1\104\1\124"+
		"\2\uffff\1\101\1\123\1\uffff\2\116\1\uffff\2\124\1\60\2\101\1\111\1\uffff"+
		"\1\132\1\124\1\uffff\1\124\1\101\1\uffff\1\116\1\105\1\117\1\uffff\1\60"+
		"\1\uffff\1\111\1\uffff\1\60\2\uffff\1\124\1\111\1\60\1\116\1\60\1\uffff"+
		"\1\101\1\105\1\124\1\122\2\uffff\1\111\1\uffff\1\60\1\uffff\2\60\1\uffff"+
		"\1\123\2\uffff\1\105\1\122\1\101\1\105\1\60\1\137\1\60\4\uffff\1\115\3"+
		"\uffff\2\60\1\104\1\uffff\1\116\2\105\1\124\2\60\1\123\1\105\1\60\1\uffff"+
		"\2\124\1\115\1\105\1\60\1\111\1\114\2\60\1\103\1\uffff\1\105\1\uffff\1"+
		"\111\1\117\1\uffff\1\60\1\uffff\1\124\1\122\2\60\1\105\2\uffff\1\60\1"+
		"\uffff\1\60\1\123\1\124\1\123\1\60\1\uffff\1\120\1\uffff\1\120\2\uffff"+
		"\2\60\2\122\1\111\2\uffff\2\60\1\uffff\1\125\2\105\1\104\1\uffff\1\117"+
		"\1\114\1\60\1\114\2\uffff\1\101\1\123\1\117\1\116\1\uffff\2\60\2\uffff"+
		"\1\123\2\uffff\1\60\1\111\1\105\1\uffff\1\117\1\60\2\uffff\2\60\1\117"+
		"\2\uffff\1\123\1\60\1\123\1\60\1\116\1\105\1\uffff\1\60\1\114\1\60\1\116"+
		"\1\60\2\uffff\1\60\1\uffff\1\105\1\60\1\114\3\uffff\1\116\1\60\1\uffff"+
		"\1\124\1\uffff\1\60\1\114\1\uffff\1\124\1\uffff\1\60\2\uffff\1\123\1\uffff"+
		"\1\111\1\60\1\uffff\1\101\1\uffff\1\111\1\132\1\uffff\1\60\1\103\1\uffff"+
		"\1\115\1\123\1\60\1\uffff\1\131\1\120\1\115\1\uffff\3\60\3\uffff";
	static final String DFA34_maxS =
		"\1\176\1\122\3\125\1\127\1\75\1\117\1\124\1\130\1\125\1\122\1\131\1\117"+
		"\1\122\1\131\1\124\1\125\2\117\1\125\1\123\1\117\2\111\1\126\1\105\1\125"+
		"\13\uffff\1\76\1\75\1\52\1\uffff\1\55\4\uffff\1\174\2\uffff\2\uffff\2"+
		"\172\3\uffff\1\125\1\102\1\172\1\116\1\122\1\114\1\105\1\114\1\117\1\116"+
		"\1\122\1\117\1\122\2\124\1\131\1\172\1\124\1\122\1\115\1\124\1\117\1\124"+
		"\1\120\1\126\1\115\1\172\1\105\1\124\2\172\1\124\1\116\2\uffff\1\116\1"+
		"\124\1\126\1\116\2\172\1\120\1\172\1\105\1\130\1\124\1\103\1\106\1\123"+
		"\1\124\1\126\1\131\1\117\1\172\1\120\1\115\1\117\1\172\1\124\1\116\1\103"+
		"\1\124\1\126\1\125\1\111\1\124\1\105\1\122\2\111\1\124\1\117\1\122\1\101"+
		"\1\122\1\110\1\114\1\105\1\101\1\115\1\116\1\123\1\111\1\103\1\104\1\111"+
		"\1\117\1\124\1\122\1\125\1\122\1\117\1\111\1\122\1\107\2\127\1\111\1\116"+
		"\1\123\1\125\1\117\1\105\1\123\1\117\1\122\1\103\2\124\1\116\1\126\1\116"+
		"\1\122\1\105\1\103\1\131\1\114\4\uffff\1\101\1\105\1\76\11\uffff\2\uffff"+
		"\1\47\2\uffff\1\47\1\146\2\172\1\145\1\71\1\uffff\3\172\2\116\1\107\1"+
		"\114\1\103\1\uffff\1\131\1\105\1\115\2\120\1\116\1\123\1\115\1\114\1\103"+
		"\1\123\1\114\1\105\1\117\1\172\1\114\1\103\1\172\1\105\2\172\1\114\1\172"+
		"\1\uffff\1\105\1\101\1\110\1\172\1\111\1\117\1\122\1\111\1\114\1\105\1"+
		"\172\1\103\1\101\1\105\1\114\2\105\1\uffff\1\122\1\172\1\131\1\uffff\1"+
		"\123\1\uffff\1\111\1\122\3\105\1\111\1\124\1\105\1\124\1\123\1\105\1\113"+
		"\1\104\1\111\1\107\1\uffff\2\105\1\125\1\172\1\105\1\uffff\1\117\1\114"+
		"\1\uffff\1\115\1\120\1\123\1\114\2\122\1\101\1\102\1\172\1\117\1\105\1"+
		"\103\1\172\1\111\1\125\1\105\1\111\1\101\1\124\1\105\1\172\1\105\1\172"+
		"\1\120\1\102\1\uffff\1\122\1\120\1\125\1\116\1\uffff\1\114\1\110\1\111"+
		"\1\101\1\113\1\117\1\127\1\111\2\122\1\114\1\110\1\104\2\113\2\124\1\105"+
		"\1\126\1\172\1\111\1\117\1\127\1\122\1\124\1\114\1\125\1\122\1\124\1\105"+
		"\1\172\1\127\1\120\1\115\1\103\1\121\1\111\2\117\1\122\1\117\1\101\1\116"+
		"\2\172\1\101\1\172\1\123\1\103\1\116\1\124\1\110\1\103\1\123\1\116\1\107"+
		"\1\114\1\116\1\172\1\110\1\125\1\114\1\101\1\125\1\105\1\117\1\104\1\117"+
		"\1\124\1\122\1\120\1\131\1\105\1\172\1\114\1\113\1\107\1\125\1\120\2\124"+
		"\1\123\1\101\1\123\1\122\1\103\1\124\1\110\1\172\1\123\1\105\1\113\1\101"+
		"\1\107\1\172\1\122\1\105\1\101\1\125\1\105\1\124\2\105\1\103\1\125\1\127"+
		"\1\124\1\172\1\114\3\122\2\uffff\1\uffff\1\uffff\1\uffff\1\172\1\uffff"+
		"\1\145\1\71\1\uffff\1\71\2\172\1\uffff\1\172\1\103\1\123\1\107\1\105\1"+
		"\110\1\111\1\172\1\111\1\117\1\122\1\172\1\105\2\172\2\124\1\104\1\172"+
		"\1\124\1\122\1\101\1\111\1\105\1\uffff\1\117\1\110\1\103\1\uffff\1\122"+
		"\2\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\116\1\117\1\103\1\124"+
		"\1\126\1\111\1\172\1\101\2\114\1\172\2\122\1\172\1\122\1\125\1\uffff\1"+
		"\172\1\105\1\117\1\101\1\122\1\172\1\123\1\124\1\172\1\122\2\172\1\114"+
		"\1\124\2\172\1\103\1\172\1\122\1\130\2\124\1\122\1\172\1\uffff\2\122\1"+
		"\101\1\123\1\122\1\124\1\120\1\125\1\101\1\122\1\101\1\105\1\122\1\101"+
		"\1\120\1\114\1\uffff\1\122\2\172\1\115\1\uffff\1\115\1\124\1\107\1\116"+
		"\1\122\1\116\1\125\1\111\1\122\1\102\1\103\1\uffff\3\172\1\106\1\uffff"+
		"\1\172\1\114\1\117\1\172\1\120\1\124\1\105\1\172\1\116\1\122\1\105\1\122"+
		"\1\105\1\116\1\172\1\105\1\172\1\105\1\172\1\117\2\172\1\105\1\172\1\103"+
		"\2\105\1\172\1\uffff\1\172\1\116\1\172\1\105\1\172\1\114\1\116\1\103\1"+
		"\101\1\105\1\125\1\124\1\115\1\uffff\1\105\1\123\1\101\1\172\1\125\1\116"+
		"\1\124\1\107\1\172\2\103\1\125\1\116\1\107\1\172\1\uffff\1\124\1\uffff"+
		"\1\124\1\uffff\1\105\1\111\1\105\1\103\1\101\1\111\1\172\1\105\2\172\1"+
		"\105\2\172\1\uffff\1\124\2\111\1\172\1\115\1\103\1\130\1\113\1\172\2\122"+
		"\1\125\1\111\1\124\1\101\1\172\1\122\1\172\1\uffff\1\125\1\172\2\105\1"+
		"\115\1\105\1\111\1\125\1\111\1\101\1\172\1\124\1\172\2\124\1\123\1\107"+
		"\1\172\1\113\2\172\1\101\1\105\1\uffff\1\117\1\105\2\172\1\104\1\105\1"+
		"\117\1\111\1\uffff\1\117\1\122\1\110\1\107\1\124\1\172\1\110\2\172\1\110"+
		"\1\105\1\104\1\172\1\117\1\172\1\uffff\2\172\1\131\1\124\1\uffff\1\71"+
		"\3\104\1\uffff\1\101\1\106\1\105\2\172\1\116\1\124\1\uffff\1\116\1\122"+
		"\1\117\1\uffff\1\172\2\uffff\1\111\1\172\1\123\1\117\1\uffff\2\172\1\124"+
		"\1\107\1\172\1\127\1\172\1\137\1\172\1\132\2\172\1\126\1\172\1\122\1\117"+
		"\1\172\1\105\1\103\1\uffff\1\116\1\111\1\131\1\172\1\uffff\1\111\1\172"+
		"\1\122\1\uffff\1\172\1\124\1\uffff\1\124\1\116\1\124\1\172\1\uffff\2\172"+
		"\1\uffff\1\101\2\uffff\2\172\1\111\1\172\2\uffff\1\101\1\uffff\1\124\1"+
		"\172\1\110\1\106\1\105\1\126\1\uffff\1\172\2\124\1\172\1\117\1\123\1\124"+
		"\1\123\1\116\1\124\1\111\1\123\1\116\1\104\1\103\2\105\1\103\1\uffff\1"+
		"\111\1\uffff\1\101\1\111\1\105\1\172\1\104\1\122\1\105\2\114\1\116\1\111"+
		"\1\114\1\124\1\101\1\uffff\1\111\1\uffff\1\127\1\uffff\1\105\1\120\1\uffff"+
		"\2\172\1\101\1\uffff\1\124\1\131\1\124\2\105\1\107\1\172\1\uffff\1\172"+
		"\1\uffff\1\172\1\uffff\1\127\1\172\1\uffff\1\117\1\uffff\1\172\1\uffff"+
		"\1\124\1\172\1\122\2\uffff\2\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124"+
		"\1\115\1\104\2\123\1\172\1\101\1\125\1\104\1\110\1\122\1\uffff\1\105\2"+
		"\172\1\116\1\uffff\1\113\1\110\1\116\1\101\1\172\1\uffff\1\115\1\105\1"+
		"\122\1\123\2\104\1\111\1\122\1\124\1\uffff\1\116\1\uffff\1\172\1\uffff"+
		"\1\172\1\uffff\1\117\1\uffff\1\172\1\114\1\122\2\103\1\uffff\2\105\1\120"+
		"\1\105\1\172\1\uffff\1\104\1\111\1\122\1\124\1\111\1\104\1\uffff\1\105"+
		"\1\uffff\1\120\1\101\1\172\1\uffff\2\172\1\116\1\103\1\116\2\124\1\103"+
		"\1\116\1\124\1\uffff\1\122\1\uffff\2\105\1\172\1\105\1\uffff\1\172\2\uffff"+
		"\1\104\1\172\1\122\1\116\2\uffff\1\101\1\172\1\111\1\116\1\172\1\111\2"+
		"\105\1\172\1\105\1\uffff\1\172\2\uffff\1\101\1\123\1\101\1\172\1\uffff"+
		"\1\122\2\uffff\1\172\1\uffff\1\172\1\105\1\124\1\117\1\103\1\122\1\172"+
		"\2\uffff\1\124\3\101\1\120\1\uffff\1\117\1\uffff\1\172\1\122\2\uffff\1"+
		"\172\1\116\1\uffff\1\111\1\uffff\1\106\1\uffff\1\105\2\uffff\1\105\1\uffff"+
		"\1\111\1\115\1\uffff\1\124\1\172\1\101\1\172\1\104\1\172\1\uffff\1\103"+
		"\1\uffff\1\111\1\uffff\1\106\2\172\1\117\3\uffff\1\114\2\uffff\1\117\1"+
		"\uffff\1\114\1\172\1\123\1\uffff\1\172\1\117\2\122\1\101\1\105\1\uffff"+
		"\1\172\1\111\1\uffff\1\120\2\172\1\111\1\107\1\172\1\116\1\123\1\101\1"+
		"\105\1\124\1\104\1\172\1\105\1\102\1\114\1\124\1\172\1\uffff\2\105\1\104"+
		"\1\124\1\172\1\103\1\102\1\105\1\117\1\123\1\115\1\105\1\172\1\105\1\116"+
		"\2\uffff\1\116\4\172\1\116\1\172\2\uffff\1\172\1\101\1\uffff\1\172\1\122"+
		"\1\uffff\2\172\1\101\2\172\1\116\2\172\1\124\1\172\1\124\1\172\1\uffff"+
		"\1\172\1\114\1\172\1\117\1\131\1\172\1\131\2\uffff\1\105\1\172\1\111\1"+
		"\104\1\107\1\uffff\1\105\1\172\1\126\2\111\1\125\1\120\1\131\1\111\1\124"+
		"\2\uffff\1\123\1\uffff\1\104\1\172\1\101\1\105\4\172\1\uffff\1\127\2\103"+
		"\1\105\1\115\1\172\1\116\1\172\1\103\3\uffff\1\172\2\124\1\172\1\105\1"+
		"\124\1\125\1\105\1\101\1\122\1\172\1\uffff\1\172\1\uffff\1\105\1\uffff"+
		"\1\172\2\124\1\uffff\1\116\1\107\1\uffff\1\101\1\104\1\115\1\uffff\2\172"+
		"\1\uffff\1\122\1\172\1\124\1\uffff\1\111\1\120\1\uffff\1\122\1\105\1\122"+
		"\1\124\1\172\1\115\1\uffff\1\172\1\115\1\124\1\122\1\105\1\116\1\uffff"+
		"\1\115\1\105\1\uffff\1\172\1\116\1\122\2\172\1\132\1\115\1\105\1\uffff"+
		"\1\124\1\uffff\1\101\1\uffff\1\172\1\124\1\117\1\122\2\uffff\1\122\1\172"+
		"\1\116\1\172\1\uffff\1\172\1\uffff\1\122\1\111\1\172\1\114\1\103\1\uffff"+
		"\1\117\1\105\2\uffff\1\126\1\105\1\uffff\1\172\1\111\1\114\1\104\2\172"+
		"\1\uffff\1\104\1\105\1\172\1\105\1\uffff\1\116\1\104\2\172\1\uffff\1\124"+
		"\1\125\1\172\1\122\3\105\1\uffff\1\122\1\107\1\172\2\uffff\1\172\2\uffff"+
		"\1\172\2\uffff\1\104\1\uffff\1\117\1\uffff\1\172\1\uffff\1\124\2\uffff"+
		"\1\124\2\uffff\1\101\1\uffff\1\111\1\uffff\1\172\1\uffff\1\111\1\uffff"+
		"\1\124\1\172\1\117\1\uffff\1\120\1\104\1\uffff\1\126\2\105\1\123\1\uffff"+
		"\1\105\1\117\1\116\1\122\1\101\1\172\1\117\1\172\1\124\1\172\1\uffff\1"+
		"\124\1\172\4\uffff\1\105\1\122\1\124\1\105\1\172\1\111\1\uffff\1\103\1"+
		"\uffff\1\113\1\172\1\uffff\1\111\1\172\1\uffff\2\172\1\105\1\116\1\111"+
		"\1\172\2\uffff\1\172\1\uffff\1\172\1\101\2\172\1\114\1\172\1\105\1\172"+
		"\1\uffff\1\172\1\uffff\1\105\1\132\1\101\2\172\1\115\1\111\1\uffff\1\120"+
		"\1\uffff\1\120\1\105\1\131\1\122\1\172\1\101\1\104\1\uffff\1\107\1\101"+
		"\2\uffff\1\101\1\111\1\172\1\111\1\124\1\105\1\122\1\111\1\172\1\uffff"+
		"\1\172\2\uffff\1\115\1\126\1\172\1\124\1\116\1\122\1\105\1\172\1\uffff"+
		"\1\117\2\172\2\uffff\2\172\1\104\1\103\1\172\2\uffff\1\172\1\124\1\uffff"+
		"\1\131\2\172\1\113\1\124\1\172\3\uffff\1\172\1\120\1\101\1\172\1\102\1"+
		"\103\1\uffff\1\116\1\172\1\uffff\1\111\1\105\1\172\1\105\2\104\1\124\1"+
		"\172\1\116\1\107\1\105\1\114\1\uffff\1\116\1\uffff\1\172\1\uffff\1\111"+
		"\1\uffff\1\101\1\111\2\172\1\uffff\1\132\1\105\1\172\1\uffff\1\117\2\uffff"+
		"\1\117\1\uffff\1\172\1\101\1\116\1\104\1\124\2\uffff\1\124\1\uffff\1\172"+
		"\2\uffff\1\111\1\uffff\1\116\1\uffff\1\172\1\101\1\122\2\uffff\1\172\1"+
		"\117\1\114\1\172\1\104\1\172\1\124\1\172\1\uffff\1\124\2\172\1\103\2\124"+
		"\1\uffff\1\117\1\105\1\172\1\115\1\126\2\uffff\1\101\1\105\1\uffff\2\172"+
		"\1\124\1\172\1\uffff\1\116\4\uffff\1\172\1\131\2\uffff\1\105\1\172\1\105"+
		"\1\172\2\uffff\1\172\1\111\2\uffff\1\105\1\102\1\uffff\1\114\1\123\1\107"+
		"\1\uffff\1\116\1\172\1\uffff\3\172\1\101\1\uffff\3\172\1\123\1\172\1\uffff"+
		"\1\117\1\104\1\124\2\uffff\1\101\1\123\1\uffff\2\116\1\uffff\2\124\1\172"+
		"\2\101\1\111\1\uffff\1\132\1\124\1\uffff\1\124\1\101\1\uffff\1\116\1\105"+
		"\1\117\1\uffff\1\172\1\uffff\1\111\1\uffff\1\172\2\uffff\1\124\1\111\1"+
		"\172\1\116\1\172\1\uffff\1\101\1\105\1\124\1\122\2\uffff\1\111\1\uffff"+
		"\1\172\1\uffff\2\172\1\uffff\1\123\2\uffff\1\105\1\122\1\101\1\105\1\172"+
		"\1\137\1\172\4\uffff\1\115\3\uffff\2\172\1\104\1\uffff\1\116\2\105\1\124"+
		"\2\172\1\123\1\105\1\172\1\uffff\2\124\1\115\1\105\1\172\1\111\1\114\2"+
		"\172\1\103\1\uffff\1\105\1\uffff\1\111\1\117\1\uffff\1\172\1\uffff\1\124"+
		"\1\122\2\172\1\105\2\uffff\1\172\1\uffff\1\172\1\123\1\124\1\123\1\172"+
		"\1\uffff\1\120\1\uffff\1\120\2\uffff\2\172\2\122\1\111\2\uffff\2\172\1"+
		"\uffff\1\125\2\105\1\104\1\uffff\1\117\1\114\1\172\1\114\2\uffff\1\101"+
		"\1\123\1\117\1\116\1\uffff\2\172\2\uffff\1\123\2\uffff\1\172\1\111\1\105"+
		"\1\uffff\1\117\1\172\2\uffff\2\172\1\117\2\uffff\1\123\1\172\1\123\1\172"+
		"\1\116\1\105\1\uffff\1\172\1\114\1\172\1\116\1\172\2\uffff\1\172\1\uffff"+
		"\1\105\1\172\1\114\3\uffff\1\116\1\172\1\uffff\1\124\1\uffff\1\172\1\114"+
		"\1\uffff\1\124\1\uffff\1\172\2\uffff\1\123\1\uffff\1\111\1\172\1\uffff"+
		"\1\101\1\uffff\1\111\1\132\1\uffff\1\172\1\103\1\uffff\1\115\1\123\1\172"+
		"\1\uffff\1\131\1\120\1\115\1\uffff\3\172\3\uffff";
	static final String DFA34_acceptS =
		"\34\uffff\1\u0153\1\u0154\1\u0155\1\u0156\1\u0157\1\u0158\1\u0159\1\u015a"+
		"\1\u015b\1\u015c\1\u015d\3\uffff\1\u0165\1\uffff\1\u0167\1\u0168\1\u016a"+
		"\1\u016b\1\uffff\1\u016e\1\u016f\4\uffff\1\u0177\1\u0178\1\u0179\41\uffff"+
		"\1\u015f\1\7\122\uffff\1\165\1\u00a2\1\u00a3\1\u0170\3\uffff\1\u0161\1"+
		"\u0162\1\u0163\1\u017b\1\u0164\1\u017a\1\u0166\1\u016d\1\u016c\13\uffff"+
		"\1\u0176\10\uffff\1\113\27\uffff\1\26\21\uffff\1\6\3\uffff\1\42\1\uffff"+
		"\1\u0084\17\uffff\1\12\5\uffff\1\u00b7\2\uffff\1\77\31\uffff\1\u0146\4"+
		"\uffff\1\22\160\uffff\1\u015e\1\u0160\1\uffff\1\u0171\2\uffff\1\u0173"+
		"\2\uffff\1\u0174\3\uffff\1\u0175\30\uffff\1\u00ea\3\uffff\1\3\1\uffff"+
		"\1\5\1\11\1\uffff\1\14\3\uffff\1\u0087\20\uffff\1\u0083\30\uffff\1\120"+
		"\20\uffff\1\u00a9\4\uffff\1\134\13\uffff\1\u0169\4\uffff\1\u0112\34\uffff"+
		"\1\u009e\15\uffff\1\u00bf\17\uffff\1\u00df\1\uffff\1\u00ad\1\uffff\1\u00fe"+
		"\15\uffff\1\u008f\22\uffff\1\153\27\uffff\1\u0096\10\uffff\1\142\17\uffff"+
		"\1\u012e\4\uffff\1\u0172\4\uffff\1\1\7\uffff\1\131\3\uffff\1\u00a7\1\uffff"+
		"\1\25\1\41\4\uffff\1\u008e\23\uffff\1\4\4\uffff\1\100\3\uffff\1\u00f4"+
		"\2\uffff\1\u011c\4\uffff\1\10\2\uffff\1\17\1\uffff\1\37\1\u00f2\4\uffff"+
		"\1\u00c1\1\70\1\uffff\1\u00af\6\uffff\1\151\22\uffff\1\u00a8\1\uffff\1"+
		"\15\16\uffff\1\75\1\uffff\1\125\1\uffff\1\111\2\uffff\1\u0135\3\uffff"+
		"\1\u00d0\7\uffff\1\u0114\1\uffff\1\u00a6\1\uffff\1\u0098\2\uffff\1\u0111"+
		"\1\uffff\1\u011b\1\uffff\1\u013c\3\uffff\1\u00f6\1\u00d8\2\uffff\1\54"+
		"\2\uffff\1\65\15\uffff\1\u0150\4\uffff\1\u00c0\5\uffff\1\u00f9\11\uffff"+
		"\1\u0149\1\uffff\1\u00b1\1\uffff\1\u013e\1\uffff\1\u0144\1\uffff\1\36"+
		"\5\uffff\1\u0134\5\uffff\1\u00c9\6\uffff\1\u012b\1\uffff\1\154\3\uffff"+
		"\1\u00fa\12\uffff\1\u010a\1\uffff\1\u0151\4\uffff\1\136\1\uffff\1\u0086"+
		"\1\u00a5\4\uffff\1\u00e8\1\55\12\uffff\1\u00f3\1\uffff\1\u0145\1\132\4"+
		"\uffff\1\u00b5\1\uffff\1\164\1\166\1\uffff\1\u010d\7\uffff\1\45\1\u00da"+
		"\5\uffff\1\2\1\uffff\1\106\2\uffff\1\122\1\u0131\2\uffff\1\u0127\1\uffff"+
		"\1\u00b3\1\uffff\1\103\1\uffff\1\107\1\140\1\uffff\1\u0100\2\uffff\1\u012f"+
		"\6\uffff\1\16\1\uffff\1\20\1\uffff\1\33\4\uffff\1\u0101\1\167\1\u009c"+
		"\1\uffff\1\u011f\1\60\1\uffff\1\u00c2\3\uffff\1\50\6\uffff\1\u00fc\2\uffff"+
		"\1\163\22\uffff\1\u0092\17\uffff\1\21\1\u00bd\7\uffff\1\24\1\u00c8\2\uffff"+
		"\1\u011d\2\uffff\1\u0097\14\uffff\1\u0117\7\uffff\1\66\1\u009f\5\uffff"+
		"\1\62\12\uffff\1\u0140\1\u00cb\1\uffff\1\40\10\uffff\1\u00ca\11\uffff"+
		"\1\u00fb\1\u0089\1\u00cc\13\uffff\1\u00d2\1\uffff\1\u0143\1\uffff\1\u0122"+
		"\3\uffff\1\u0132\2\uffff\1\u008d\3\uffff\1\u00b2\2\uffff\1\u0110\3\uffff"+
		"\1\u00b6\2\uffff\1\u010e\6\uffff\1\46\6\uffff\1\157\2\uffff\1\155\10\uffff"+
		"\1\u014d\1\uffff\1\u00f8\1\uffff\1\u012c\4\uffff\1\u009d\1\u00e0\4\uffff"+
		"\1\31\1\uffff\1\76\5\uffff\1\72\2\uffff\1\13\1\67\2\uffff\1\71\6\uffff"+
		"\1\176\4\uffff\1\u00b0\4\uffff\1\u013b\7\uffff\1\123\3\uffff\1\121\1\u00d1"+
		"\1\uffff\1\u0082\1\u00ce\1\uffff\1\23\1\u00eb\1\uffff\1\27\1\uffff\1\u00ff"+
		"\1\uffff\1\u0116\1\uffff\1\u00c4\1\150\1\uffff\1\135\1\141\1\uffff\1\170"+
		"\1\uffff\1\u0136\1\uffff\1\u00bb\1\uffff\1\u00e6\3\uffff\1\u012d\2\uffff"+
		"\1\u00c3\4\uffff\1\u00e3\12\uffff\1\56\2\uffff\1\112\1\144\1\u008a\1\u00be"+
		"\6\uffff\1\u010c\1\uffff\1\u00e7\2\uffff\1\105\2\uffff\1\u0119\6\uffff"+
		"\1\101\1\104\1\uffff\1\u00d4\10\uffff\1\u0115\1\uffff\1\u010b\7\uffff"+
		"\1\u00d5\1\uffff\1\116\7\uffff\1\u0124\2\uffff\1\u00cd\1\u00db\11\uffff"+
		"\1\u00d9\1\uffff\1\u0095\1\51\10\uffff\1\u0090\3\uffff\1\u0130\1\161\5"+
		"\uffff\1\u00a4\1\u0142\2\uffff\1\177\6\uffff\1\115\1\152\1\u00cf\6\uffff"+
		"\1\u00bc\2\uffff\1\u0138\14\uffff\1\u0123\1\uffff\1\u0085\1\uffff\1\52"+
		"\1\uffff\1\u0088\4\uffff\1\u0107\3\uffff\1\47\1\uffff\1\114\1\u00dd\1"+
		"\uffff\1\u0103\5\uffff\1\63\1\u00e5\1\uffff\1\u00ef\1\uffff\1\u00aa\1"+
		"\u014a\1\uffff\1\u0133\1\uffff\1\137\3\uffff\1\u010f\1\u00f7\10\uffff"+
		"\1\u008c\6\uffff\1\u0141\5\uffff\1\u0139\1\u0080\2\uffff\1\133\4\uffff"+
		"\1\u00fd\1\uffff\1\102\1\u0091\1\u0128\1\110\2\uffff\1\u0099\1\30\4\uffff"+
		"\1\u00b8\1\126\2\uffff\1\u00f5\1\u014b\2\uffff\1\117\3\uffff\1\u0120\2"+
		"\uffff\1\u00c7\4\uffff\1\35\5\uffff\1\u0152\3\uffff\1\u00e4\1\u013d\2"+
		"\uffff\1\u011a\2\uffff\1\u00d3\6\uffff\1\74\2\uffff\1\u0129\2\uffff\1"+
		"\61\3\uffff\1\127\1\uffff\1\u008b\1\uffff\1\53\1\uffff\1\u0093\1\u00ee"+
		"\5\uffff\1\32\4\uffff\1\u00b4\1\u011e\1\uffff\1\u00c5\1\uffff\1\156\2"+
		"\uffff\1\57\1\uffff\1\u00b9\1\u0113\7\uffff\1\143\1\u00dc\1\u00ec\1\u014e"+
		"\1\uffff\1\124\1\u00ed\1\u00c6\3\uffff\1\43\11\uffff\1\146\12\uffff\1"+
		"\160\1\uffff\1\171\2\uffff\1\u0121\1\uffff\1\u012a\5\uffff\1\u013a\1\u0094"+
		"\1\uffff\1\64\5\uffff\1\u00de\1\uffff\1\34\1\uffff\1\u0102\1\44\5\uffff"+
		"\1\u0125\1\162\2\uffff\1\u0126\4\uffff\1\u014c\4\uffff\1\u0118\1\u0081"+
		"\4\uffff\1\u014f\2\uffff\1\172\1\174\1\uffff\1\147\1\u00e9\3\uffff\1\u00ab"+
		"\2\uffff\1\145\1\73\3\uffff\1\u0104\1\u00e1\6\uffff\1\u0105\5\uffff\1"+
		"\173\1\175\1\uffff\1\u009b\3\uffff\1\u00ae\1\u00d6\1\u00d7\2\uffff\1\u00f0"+
		"\1\uffff\1\u00ba\2\uffff\1\u0106\1\uffff\1\u00a0\1\uffff\1\u0108\1\u00a1"+
		"\1\uffff\1\u00e2\2\uffff\1\u00ac\1\uffff\1\u0137\2\uffff\1\u0147\2\uffff"+
		"\1\u0109\3\uffff\1\u009a\3\uffff\1\130\3\uffff\1\u0148\1\u00f1\1\u013f";
	static final String DFA34_specialS =
		"\63\uffff\1\6\1\7\u008a\uffff\1\2\1\0\1\uffff\1\4\1\1\u00ea\uffff\1\3"+
		"\1\uffff\1\5\u0571\uffff}>";
	static final String[] DFA34_transitionS = {
			"\2\71\2\uffff\1\71\22\uffff\1\71\1\6\1\64\1\uffff\1\31\1\55\1\56\1\63"+
			"\1\40\1\41\1\54\1\52\1\36\1\53\1\34\1\51\1\65\11\66\1\35\1\37\1\47\1"+
			"\46\1\50\1\62\1\uffff\1\3\1\14\1\24\1\12\1\11\1\2\1\13\1\15\1\10\1\22"+
			"\1\30\1\7\1\25\1\4\1\5\1\21\1\33\1\23\1\17\1\1\1\20\1\27\1\16\1\67\1"+
			"\32\1\26\1\42\1\uffff\1\43\1\61\1\70\33\67\1\44\1\60\1\45\1\57",
			"\1\73\1\77\2\uffff\1\76\2\uffff\1\100\1\75\5\uffff\1\74\2\uffff\1\72",
			"\1\101\3\uffff\1\107\3\uffff\1\104\2\uffff\1\105\2\uffff\1\106\2\uffff"+
			"\1\102\2\uffff\1\103",
			"\1\117\1\120\1\115\1\uffff\1\113\5\uffff\1\110\1\uffff\1\111\1\uffff"+
			"\1\121\1\uffff\1\114\1\112\1\uffff\1\116",
			"\1\122\5\uffff\1\123",
			"\1\130\7\uffff\1\127\1\uffff\1\131\1\uffff\1\124\2\uffff\1\126\1\125"+
			"\1\132",
			"\1\133",
			"\1\136\3\uffff\1\137\3\uffff\1\135\5\uffff\1\140",
			"\1\146\1\uffff\1\141\6\uffff\1\143\1\142\4\uffff\1\144\1\145",
			"\1\152\1\uffff\1\151\4\uffff\1\150\4\uffff\1\147",
			"\1\155\1\160\2\uffff\1\153\3\uffff\1\154\5\uffff\1\157\2\uffff\1\156"+
			"\2\uffff\1\161",
			"\1\162",
			"\1\167\3\uffff\1\165\5\uffff\1\164\5\uffff\1\166\3\uffff\1\163",
			"\1\170\15\uffff\1\171",
			"\1\177\3\uffff\1\174\2\uffff\1\172\1\173\5\uffff\1\175\2\uffff\1\176",
			"\1\u0085\1\uffff\1\u0080\2\uffff\1\u0081\2\uffff\1\u0087\1\uffff\1\u0083"+
			"\1\u0088\1\u0082\3\uffff\1\u0086\1\u0084\1\u0089\3\uffff\1\u008a",
			"\1\u008b\1\uffff\1\u008e\1\uffff\1\u008f\1\u008c\1\u008d",
			"\1\u0091\3\uffff\1\u0092\6\uffff\1\u0093\2\uffff\1\u0095\2\uffff\1\u0090"+
			"\2\uffff\1\u0094",
			"\1\u0097\15\uffff\1\u0096",
			"\1\u009c\3\uffff\1\u0099\3\uffff\1\u0098\2\uffff\1\u009b\2\uffff\1\u009a",
			"\1\u00a1\1\u00a2\5\uffff\1\u00a0\3\uffff\1\u009e\2\uffff\1\u009d\2\uffff"+
			"\1\u009f\2\uffff\1\u00a3",
			"\1\u00a6\3\uffff\1\u00a5\3\uffff\1\u00a7\5\uffff\1\u00a8\3\uffff\1\u00a4",
			"\1\u00a9",
			"\1\u00aa\3\uffff\1\u00ac\3\uffff\1\u00ab",
			"\1\u00ad\3\uffff\1\u00ae",
			"\1\u00b1\5\uffff\1\u00af\12\uffff\1\u00b0",
			"\1\u00b3",
			"\1\u00b4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b5\1\133",
			"\1\u00b7",
			"\1\u00b9",
			"",
			"\1\u00bb",
			"",
			"",
			"",
			"",
			"\1\u00bd",
			"",
			"",
			"\47\u00bf\1\u00c1\64\u00bf\1\u00c0\uffa3\u00bf",
			"\42\u00c2\1\u00c4\71\u00c2\1\u00c3\uffa3\u00c2",
			"\1\u00c8\1\uffff\12\u00c7\7\uffff\1\67\1\u00cc\1\67\1\u00cb\1\u00c9"+
			"\1\67\1\u00cd\3\67\1\u00cd\1\u00c6\1\u00cd\5\67\1\u00c6\4\67\1\u00c5"+
			"\1\u00c6\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cd\2\67\1\u00c9\1\67\1\u00cd"+
			"\3\67\1\u00cd\1\67\1\u00cd\15\67",
			"\1\u00c8\1\uffff\12\u00c7\7\uffff\1\67\1\u00cc\1\67\1\u00cb\1\u00c9"+
			"\1\67\1\u00cd\3\67\1\u00cd\1\u00c6\1\u00cd\5\67\1\u00c6\5\67\1\u00c6"+
			"\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cd\2\67\1\u00c9\1\67\1\u00cd\3\67"+
			"\1\u00cd\1\67\1\u00cd\15\67",
			"",
			"",
			"",
			"\1\u00cf\7\uffff\1\u00d0\13\uffff\1\u00ce",
			"\1\u00d1",
			"\12\67\7\uffff\24\67\1\u00d2\5\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00d5\1\u00d4",
			"\1\u00d7\4\uffff\1\u00d6",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc\1\uffff\1\u00dd",
			"\1\u00df\6\uffff\1\u00e0\5\uffff\1\u00de",
			"\1\u00e1",
			"\1\u00e3\5\uffff\1\u00e2",
			"\1\u00e4",
			"\1\u00e5\7\uffff\1\u00e6",
			"\1\u00e9\2\uffff\1\u00e7\24\uffff\1\u00e8",
			"\12\67\7\uffff\2\67\1\u00ea\27\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00ec",
			"\1\u00ee\16\uffff\1\u00ed",
			"\1\u00ef\10\uffff\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5\3\uffff\1\u00f9\1\u00f7\1\u00f6\1\uffff\1\u00f8",
			"\1\u00fa\1\u00fb",
			"\12\67\7\uffff\3\67\1\u00fc\26\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00fe",
			"\1\u00ff",
			"\12\67\7\uffff\13\67\1\u0100\16\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\5\67\1\u0102\24\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0105\16\uffff\1\u0104",
			"\1\u0106",
			"",
			"",
			"\1\u0107\1\uffff\1\u0109\1\u0108",
			"\1\u010a\1\u010b",
			"\1\u010c\14\uffff\1\u010d\2\uffff\1\u010e",
			"\1\u0110\1\uffff\1\u010f\3\uffff\1\u0111\6\uffff\1\u0112",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\3\67\1\u0115\11\67\1\u0118\1\67\1\u0116\2\67\1\u0114"+
			"\1\u0117\6\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u011a",
			"\12\67\7\uffff\16\67\1\u011b\13\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u011d",
			"\1\u011e",
			"\1\u0120\5\uffff\1\u011f\6\uffff\1\u0121\3\uffff\1\u0122",
			"\1\u0123",
			"\1\u0124\2\uffff\1\u0125\1\uffff\1\u0126",
			"\1\u0127",
			"\1\u012b\1\u0129\2\uffff\1\u012d\5\uffff\1\u012a\3\uffff\1\u012c\2\uffff"+
			"\1\u0128\1\u012e",
			"\1\u0130\1\u012f\2\uffff\1\u0131",
			"\1\u0132\4\uffff\1\u0133",
			"\1\u0134",
			"\12\67\7\uffff\24\67\1\u0135\5\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0137",
			"\1\u0138",
			"\1\u013a\15\uffff\1\u0139",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u013c\4\uffff\1\u013d",
			"\1\u013e\6\uffff\1\u013f",
			"\1\u0140",
			"\1\u0141\15\uffff\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145\3\uffff\1\u0146",
			"\1\u0148\5\uffff\1\u0147",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u0151\10\uffff\1\u014d\1\u0150\4\uffff\1\u014e\1\uffff\1\u014f",
			"\1\u0153\15\uffff\1\u0152",
			"\1\u0154",
			"\1\u0155",
			"\1\u0158\15\uffff\1\u0157\2\uffff\1\u0156",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u0163\1\u0164\1\uffff\1\u0161\4\uffff\1\u015f\2\uffff\1\u0162\1\u0165"+
			"\5\uffff\1\u0160",
			"\1\u0167\3\uffff\1\u0166",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b\3\uffff\1\u016d\5\uffff\1\u016c",
			"\1\u016e\1\uffff\1\u016f",
			"\1\u0170",
			"\1\u0172\23\uffff\1\u0171",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u017e\1\u0178\1\u017f\1\u017b\1\uffff\1\u0184\1\u017c\4\uffff\1\u0183"+
			"\1\uffff\1\u017a\1\u0182\1\u0179\2\uffff\1\u0180\2\uffff\1\u017d\1\u0181",
			"\1\u0186\12\uffff\1\u0185",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189\1\u018a\1\u018b\4\uffff\1\u018c",
			"\1\u018d",
			"\1\u018e\11\uffff\1\u018f",
			"\1\u0190\3\uffff\1\u0191",
			"\1\u0193\17\uffff\1\u0192",
			"\1\u0194",
			"\1\u0196\17\uffff\1\u0195",
			"\1\u0197",
			"\1\u0199\1\uffff\1\u0198",
			"\1\u019b\12\uffff\1\u019d\1\uffff\1\u019a\3\uffff\1\u019c",
			"\1\u019e",
			"\1\u01a0\3\uffff\1\u019f\3\uffff\1\u01a1",
			"\1\u01a2",
			"\1\u01a4\5\uffff\1\u01a3",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"",
			"",
			"",
			"",
			"\1\u01a9",
			"\1\u01ab\3\uffff\1\u01aa",
			"\1\u01ac",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\47\u00bf\1\u00c1\64\u00bf\1\u00c0\uffa3\u00bf",
			"\0\u01ae",
			"\1\64\4\uffff\1\63",
			"\42\u00c2\1\u00c4\71\u00c2\1\u00c3\uffa3\u00c2",
			"\0\u01b0",
			"\1\64\4\uffff\1\63",
			"\12\u01b1\7\uffff\6\u01b1\32\uffff\6\u01b1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00c8\1\uffff\12\u00c7\7\uffff\1\67\1\u00cc\1\67\1\u00cb\1\u00c9"+
			"\1\67\1\u00cd\3\67\1\u00cd\1\u00c6\1\u00cd\5\67\1\u00c6\5\67\1\u00c6"+
			"\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cd\2\67\1\u00c9\1\67\1\u00cd\3\67"+
			"\1\u00cd\1\67\1\u00cd\15\67",
			"\12\u01b3\10\uffff\1\u01b5\1\uffff\1\u01b5\1\u01b4\37\uffff\1\u01b4",
			"\1\u01b6\1\uffff\1\u01b6\2\uffff\12\u01b7",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\3\67\1\u01b8\26\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01ba\10\uffff\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd\15\uffff\1\u01ce",
			"\12\67\7\uffff\2\67\1\u01d1\1\67\1\u01d0\7\67\1\u01cf\15\67\4\uffff"+
			"\1\67\1\uffff\32\67",
			"\1\u01d3",
			"\1\u01d4",
			"\12\67\7\uffff\16\67\1\u01d5\13\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01d7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01da",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01e0",
			"\1\u01e1\6\uffff\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"",
			"\1\u01ed",
			"\12\67\7\uffff\4\67\1\u01ee\12\67\1\u01ef\12\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u01f1",
			"",
			"\1\u01f2",
			"",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe\11\uffff\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205\23\uffff\1\u0206",
			"\12\67\7\uffff\4\67\1\u0207\11\67\1\u0208\13\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u020a",
			"",
			"\1\u020b",
			"\1\u020c",
			"",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210\2\uffff\1\u0212\3\uffff\1\u0211",
			"\1\u0214\2\uffff\1\u0213\2\uffff\1\u0215",
			"\1\u0216\14\uffff\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\12\67\7\uffff\10\67\1\u021e\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0221\3\uffff\1\u0220",
			"\1\u0222",
			"\1\u0223",
			"\1\u0226\3\uffff\1\u0224\3\uffff\1\u0225",
			"\1\u0227",
			"\1\u0229\22\uffff\1\u0228",
			"\1\u022a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u022c\3\uffff\1\u022d",
			"\12\67\7\uffff\16\67\1\u022f\3\67\1\u022e\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u0231",
			"\1\u0232",
			"",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"\1\u0236",
			"",
			"\1\u0237",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f",
			"\1\u0241\3\uffff\1\u0240",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a\21\uffff\1\u024b",
			"\12\67\7\uffff\22\67\1\u024c\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0256\3\uffff\1\u0254\13\uffff\1\u0255",
			"\1\u0257",
			"\1\u0259\1\uffff\1\u0258",
			"\1\u025a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\1\u0261\1\uffff\1\u0260",
			"\1\u0262\3\uffff\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\12\67\7\uffff\21\67\1\u026a\10\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\u026c\1\uffff\32\67",
			"\1\u026e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0271\17\uffff\1\u0270",
			"\1\u0272",
			"\1\u0274\1\u0273",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280\12\uffff\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0289\4\uffff\1\u0288",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c\11\uffff\1\u028d",
			"\1\u028e",
			"\12\67\7\uffff\22\67\1\u028f\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0292\6\uffff\1\u0291",
			"\1\u0293",
			"\1\u0294",
			"\1\u0296\10\uffff\1\u0295",
			"\1\u0297\2\uffff\1\u0298",
			"\1\u029a\2\uffff\1\u029b\14\uffff\1\u029c\1\u0299",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1\3\uffff\1\u02a2",
			"\1\u02a3",
			"\1\u02a6\1\uffff\1\u02a5\16\uffff\1\u02a4",
			"\1\u02a7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02aa\1\u02a9",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\12\67\7\uffff\11\67\1\u02af\5\67\1\u02b0\12\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u02b2",
			"\1\u02b4\1\uffff\1\u02b3",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bd\13\uffff\1\u02bc",
			"\1\u02be",
			"\1\u02bf",
			"\12\67\7\uffff\22\67\1\u02c0\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"",
			"",
			"\47\u00bf\1\u00c1\64\u00bf\1\u00c0\uffa3\u00bf",
			"",
			"\42\u00c2\1\u00c4\71\u00c2\1\u00c3\uffa3\u00c2",
			"\12\u01b1\7\uffff\6\u01b1\24\67\4\uffff\1\67\1\uffff\6\u01b1\24\67",
			"",
			"\12\u01b3\10\uffff\1\u01b5\1\uffff\1\u01b5\1\u01b4\37\uffff\1\u01b4",
			"\1\u02c7\1\uffff\1\u02c7\2\uffff\12\u02c8",
			"",
			"\12\u02c9",
			"\12\u01b7\7\uffff\1\67\1\u02ca\1\67\1\u00cb\26\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\12\67\7\uffff\22\67\1\u02d2\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\12\67\7\uffff\5\67\1\u02de\24\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"",
			"\1\u02e5",
			"\1\u02e6",
			"\1\u02e7",
			"",
			"\1\u02e8",
			"",
			"",
			"\1\u02e9",
			"",
			"\1\u02ea",
			"\1\u02eb",
			"\1\u02ec",
			"",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02f4",
			"\1\u02f5",
			"\1\u02f6",
			"\12\67\7\uffff\22\67\1\u02f7\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02f9",
			"\1\u02fa",
			"\12\67\7\uffff\26\67\1\u02fb\3\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02fd",
			"\1\u02fe",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0305",
			"\1\u0306",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0308",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030b",
			"\1\u030c\7\uffff\1\u030d",
			"\12\67\7\uffff\22\67\1\u030e\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0311",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317\12\uffff\1\u0318",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0327\3\uffff\1\u0326",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"",
			"\1\u032b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\21\67\1\u032d\10\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u032f",
			"",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338\10\uffff\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"",
			"\12\67\7\uffff\1\67\1\u033c\30\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\23\67\1\u033e\6\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0340",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0342",
			"\1\u0343",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\12\67\7\uffff\22\67\1\u034f\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0351",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0353",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0355",
			"\12\67\7\uffff\22\67\1\u0356\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\13\67\1\u0358\16\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0361",
			"\12\67\7\uffff\32\67\4\uffff\1\u0362\1\uffff\32\67",
			"\1\u0364",
			"\12\67\7\uffff\4\67\1\u0365\25\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c\13\uffff\1\u036d",
			"\1\u036e",
			"\1\u0370\10\uffff\1\u036f",
			"",
			"\1\u0371",
			"\1\u0372",
			"\1\u0373",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0375",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0380",
			"",
			"\1\u0381",
			"",
			"\1\u0382",
			"\1\u0384\3\uffff\1\u0383",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u038c\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\2\67\1\u0390\27\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\12\67\7\uffff\1\u0396\7\67\1\u0395\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\12\67\7\uffff\22\67\1\u039c\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u03a8\22\uffff\1\u03a7",
			"\12\67\7\uffff\22\67\1\u03a9\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af\3\uffff\1\u03b0",
			"\1\u03b2\23\uffff\1\u03b1",
			"\1\u03b3",
			"\1\u03b4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03b6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03bd",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c0",
			"\1\u03c1",
			"",
			"\1\u03c2",
			"\1\u03c3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"",
			"\1\u03ca",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce\1\u03cf",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03d1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\12\67\7\uffff\22\67\1\u03d7\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03d9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u03dc\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03de",
			"\1\u03df",
			"",
			"\12\u02c8",
			"\12\u02c8\10\uffff\1\u01b5\1\uffff\1\u01b5",
			"\12\u02c9\10\uffff\1\u01b5\1\uffff\1\u01b5",
			"\1\u01b8",
			"",
			"\1\u03e0",
			"\1\u03e2\4\uffff\1\u03e1",
			"\1\u03e3",
			"\12\67\7\uffff\22\67\1\u03e4\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03e7",
			"\1\u03e8",
			"",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u03ed",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03ef",
			"\1\u03f0",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f3",
			"\1\u03f4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03fa",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03fd",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03ff",
			"\1\u0400",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0402\3\uffff\1\u0403",
			"\1\u0404",
			"",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0409",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040b",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040d",
			"",
			"\1\u040e",
			"\1\u040f",
			"\1\u0410",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0414",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0417",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0419",
			"",
			"\1\u041a",
			"\12\67\7\uffff\4\67\1\u041b\25\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u041d",
			"\1\u041f\1\uffff\1\u041e",
			"\1\u0420",
			"\1\u0422\2\uffff\1\u0421",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0424",
			"\1\u0425",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0427",
			"\1\u0428",
			"\1\u0429",
			"\1\u042a",
			"\1\u042b",
			"\1\u042c",
			"\1\u042d",
			"\1\u042e",
			"\1\u042f",
			"\1\u0430",
			"\1\u0431",
			"\1\u0432",
			"\1\u0433",
			"\1\u0434",
			"",
			"\1\u0435",
			"",
			"\1\u0436",
			"\1\u0437",
			"\1\u0438",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u043a",
			"\1\u043b",
			"\1\u043c",
			"\1\u043d",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"\1\u0441",
			"\1\u0442",
			"\1\u0443",
			"",
			"\1\u0444",
			"",
			"\1\u0445",
			"",
			"\1\u0446",
			"\1\u0447",
			"",
			"\12\67\7\uffff\10\67\1\u0448\21\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u044b",
			"",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\1\u0450",
			"\1\u0451",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0454",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0455",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0457",
			"\12\67\7\uffff\17\67\1\u0458\12\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u045a",
			"",
			"",
			"\1\u045b",
			"\1\u045c",
			"",
			"\1\u045d",
			"\1\u045e",
			"",
			"\1\u045f",
			"\1\u0460",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"\1\u0464",
			"\1\u0465",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0467",
			"\1\u0468",
			"\1\u0469",
			"\1\u046a",
			"\1\u046b",
			"",
			"\1\u046c",
			"\12\67\7\uffff\23\67\1\u046d\6\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0470",
			"",
			"\1\u0471",
			"\1\u0472",
			"\1\u0473",
			"\1\u0474",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0476",
			"\1\u0477",
			"\1\u0478",
			"\1\u0479",
			"\1\u047a",
			"\1\u047b",
			"\1\u047c",
			"\1\u047d",
			"\1\u047e",
			"",
			"\1\u047f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0482",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0484",
			"\1\u0485",
			"\1\u0486",
			"\1\u0487",
			"",
			"\1\u0488",
			"\1\u0489",
			"\1\u048a",
			"\1\u048b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u048d",
			"\1\u048e",
			"\1\u048f",
			"\1\u0490",
			"\1\u0491",
			"\1\u0492",
			"",
			"\1\u0493",
			"",
			"\1\u0494",
			"\1\u0495",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0499",
			"\1\u049a",
			"\1\u049b",
			"\1\u049c",
			"\1\u049d",
			"\1\u049e",
			"\1\u049f",
			"\1\u04a0",
			"",
			"\1\u04a1",
			"",
			"\1\u04a2",
			"\1\u04a3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04a5",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04a7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04a9",
			"\1\u04aa",
			"",
			"",
			"\1\u04ab",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04ad",
			"\1\u04ae",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04b0",
			"\1\u04b1",
			"\1\u04b2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04b4",
			"",
			"\12\67\7\uffff\22\67\1\u04b5\7\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04b7",
			"\1\u04b8",
			"\1\u04b9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u04bb",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\u04bc\1\uffff\32\67",
			"\1\u04be",
			"\1\u04bf",
			"\1\u04c0",
			"\1\u04c1",
			"\1\u04c2",
			"\12\67\7\uffff\1\u04c3\31\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04c5",
			"\1\u04c6",
			"\1\u04c7",
			"\1\u04c8",
			"\1\u04c9",
			"",
			"\1\u04ca",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04cc",
			"",
			"",
			"\12\67\7\uffff\23\67\1\u04cd\6\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04cf",
			"",
			"\1\u04d0",
			"",
			"\1\u04d1",
			"",
			"\1\u04d2",
			"",
			"",
			"\1\u04d3",
			"",
			"\1\u04d4",
			"\1\u04d5",
			"",
			"\1\u04d6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04d8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04da",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u04dc",
			"",
			"\1\u04dd",
			"",
			"\1\u04df\1\uffff\1\u04de",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04e2",
			"",
			"",
			"",
			"\1\u04e3",
			"",
			"",
			"\1\u04e4",
			"",
			"\1\u04e5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04e7",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04e9",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\1\u04ed",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04ef",
			"",
			"\1\u04f0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04f3",
			"\1\u04f4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04f6",
			"\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"\1\u04fa",
			"\1\u04fb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04fd",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u0500",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0502",
			"\1\u0503",
			"\1\u0504",
			"\1\u0505",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0507",
			"\1\u0508",
			"\1\u0509",
			"\1\u050a",
			"\1\u050b",
			"\1\u050c",
			"\1\u050d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u050f",
			"\1\u0510",
			"",
			"",
			"\1\u0511",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u0514\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0517",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u051a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u051c",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u051e\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0520",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0523",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0526",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0528",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\22\67\1\u052a\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u052c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u052e",
			"\1\u052f",
			"\12\67\7\uffff\11\67\1\u0530\20\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0532",
			"",
			"",
			"\1\u0533",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0535",
			"\1\u0536",
			"\1\u0537",
			"",
			"\1\u0538",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u053a",
			"\1\u053b",
			"\1\u053c",
			"\1\u053d",
			"\1\u053e",
			"\1\u053f",
			"\1\u0540",
			"\1\u0541",
			"",
			"",
			"\1\u0542",
			"",
			"\1\u0543",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0545",
			"\1\u0546",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u054b\4\uffff\1\u054c",
			"\1\u054d",
			"\1\u054e",
			"\1\u054f",
			"\1\u0550",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0552",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0554",
			"",
			"",
			"",
			"\12\67\7\uffff\22\67\1\u0555\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0557",
			"\1\u0558",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u055a",
			"\1\u055b",
			"\1\u055c",
			"\1\u055d",
			"\1\u055e",
			"\1\u055f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0562",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0564",
			"\1\u0565",
			"",
			"\1\u0566",
			"\1\u0567",
			"",
			"\1\u0568",
			"\1\u0569",
			"\1\u056a",
			"",
			"\12\67\7\uffff\22\67\1\u056b\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u056d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u056f",
			"",
			"\1\u0570",
			"\1\u0571",
			"",
			"\1\u0572",
			"\1\u0573",
			"\1\u0574",
			"\1\u0575",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0577",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0579",
			"\1\u057a",
			"\1\u057b",
			"\1\u057c",
			"\1\u057d",
			"",
			"\1\u057e",
			"\1\u057f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0581",
			"\1\u0582",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0585",
			"\1\u0586",
			"\1\u0587",
			"",
			"\1\u0588",
			"",
			"\1\u0589",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u058a",
			"\1\u058b",
			"\1\u058c",
			"",
			"",
			"\1\u058d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u058f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0592",
			"\1\u0593",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0594",
			"\1\u0595",
			"",
			"\1\u0596",
			"\1\u0597",
			"",
			"",
			"\1\u0598",
			"\1\u0599",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u059b",
			"\1\u059c",
			"\1\u059d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05a0",
			"\1\u05a1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05a2",
			"",
			"\1\u05a3",
			"\1\u05a4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05a7",
			"\1\u05a8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05aa",
			"\1\u05ab",
			"\1\u05ac",
			"\1\u05ad",
			"",
			"\1\u05ae",
			"\1\u05af",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u05b3",
			"",
			"\1\u05b4",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05b5",
			"",
			"",
			"\1\u05b6",
			"",
			"",
			"\1\u05b7",
			"",
			"\1\u05b8",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05ba",
			"",
			"\1\u05bb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05bd",
			"",
			"\1\u05be",
			"\1\u05bf",
			"",
			"\1\u05c0",
			"\1\u05c1",
			"\1\u05c2",
			"\1\u05c3",
			"",
			"\1\u05c4",
			"\1\u05c5",
			"\1\u05c6",
			"\1\u05c7",
			"\1\u05c8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05ca",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05cc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05ce",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"",
			"\1\u05d0",
			"\1\u05d1",
			"\1\u05d2",
			"\1\u05d3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05d5",
			"",
			"\1\u05d6",
			"",
			"\1\u05d7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05d9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\10\67\1\u05dc\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05de",
			"\1\u05df",
			"\1\u05e0",
			"\12\67\7\uffff\4\67\1\u05e1\15\67\1\u05e2\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\u05e5\1\uffff\32\67",
			"\1\u05e7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05ea",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05ec",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05ee",
			"\1\u05ef",
			"\1\u05f0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05f3",
			"\1\u05f4",
			"",
			"\1\u05f5",
			"",
			"\1\u05f6",
			"\1\u05f7",
			"\1\u05f8",
			"\1\u05f9",
			"\12\67\7\uffff\22\67\1\u05fa\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05fc",
			"\1\u05fd",
			"",
			"\1\u05fe",
			"\1\u05ff",
			"",
			"",
			"\1\u0600",
			"\1\u0601",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0603",
			"\1\u0604",
			"\1\u0605",
			"\1\u0606",
			"\1\u0607",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u060a",
			"\1\u060b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u060d",
			"\1\u060e",
			"\1\u060f",
			"\1\u0610",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0612",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0617",
			"\1\u0618",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u061b",
			"",
			"\1\u061d\17\uffff\1\u061c",
			"\12\67\7\uffff\22\67\1\u061e\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0621",
			"\1\u0622",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0625",
			"\1\u0626",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0628",
			"\1\u0629",
			"",
			"\1\u062a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u062c",
			"\1\u062d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u062f",
			"\1\u0630",
			"\1\u0631",
			"\1\u0632",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0634",
			"\1\u0635",
			"\1\u0636",
			"\1\u0637",
			"",
			"\1\u0638",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u063a",
			"",
			"\1\u063b",
			"\1\u063c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u063f",
			"\1\u0640",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0642",
			"",
			"",
			"\1\u0643",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0645",
			"\1\u0646",
			"\1\u0647",
			"\1\u0648",
			"",
			"",
			"\1\u0649\17\uffff\1\u064a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u064c",
			"",
			"\1\u064d",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u064f",
			"\1\u0650",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0652",
			"\1\u0653",
			"\12\67\7\uffff\13\67\1\u0654\16\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0656",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0658",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u065a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u065d",
			"\1\u065e",
			"\1\u065f",
			"",
			"\1\u0660",
			"\1\u0661",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0663",
			"\1\u0664",
			"",
			"",
			"\1\u0665",
			"\1\u0666",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0669",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u066b",
			"",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u066d",
			"",
			"",
			"\1\u066e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0670",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0673",
			"",
			"",
			"\1\u0674",
			"\1\u0675",
			"",
			"\1\u0676",
			"\1\u0677",
			"\1\u0678",
			"",
			"\1\u0679",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u067e",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0682",
			"\12\67\7\uffff\4\67\1\u0684\15\67\1\u0683\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"",
			"\1\u0686",
			"\1\u0687",
			"\1\u0688",
			"",
			"",
			"\1\u0689",
			"\1\u068a",
			"",
			"\1\u068b",
			"\1\u068c",
			"",
			"\1\u068d",
			"\1\u068e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0690",
			"\1\u0691",
			"\1\u0692",
			"",
			"\1\u0693",
			"\1\u0694",
			"",
			"\1\u0695",
			"\1\u0696",
			"",
			"\1\u0697",
			"\1\u0698",
			"\1\u0699",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u069b",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u069d",
			"\1\u069e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06a0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06a2",
			"\1\u06a3",
			"\1\u06a4",
			"\1\u06a5",
			"",
			"",
			"\1\u06a6",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\3\67\1\u06a9\26\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06ab",
			"",
			"",
			"\1\u06ac",
			"\1\u06ad",
			"\1\u06ae",
			"\1\u06af",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06b1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"",
			"\1\u06b3",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06b6",
			"",
			"\1\u06b7",
			"\1\u06b8",
			"\1\u06b9",
			"\1\u06ba",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06bd",
			"\1\u06be",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06c0",
			"\1\u06c1",
			"\1\u06c2",
			"\1\u06c3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06c5",
			"\1\u06c6",
			"\12\67\7\uffff\1\u06c8\21\67\1\u06c7\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06cb",
			"",
			"\1\u06cc",
			"",
			"\1\u06cd",
			"\1\u06ce",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06d0",
			"\1\u06d1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06d4",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06d7",
			"\1\u06d8",
			"\1\u06d9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06db",
			"",
			"\1\u06dc",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06df",
			"\1\u06e0",
			"\1\u06e1",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06e4",
			"\1\u06e5",
			"\1\u06e6",
			"\1\u06e7",
			"",
			"\1\u06e8",
			"\1\u06e9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06eb",
			"",
			"",
			"\1\u06ec",
			"\1\u06ed",
			"\1\u06ee",
			"\1\u06ef",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u06f2",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06f4",
			"\1\u06f5",
			"",
			"\1\u06f6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06fa",
			"",
			"",
			"\1\u06fb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06fd",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06ff",
			"\1\u0700",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0702",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0704",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0707",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0709",
			"",
			"",
			"",
			"\1\u070a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u070c",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u070e",
			"",
			"\1\u070f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0711",
			"",
			"\1\u0712",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0714",
			"",
			"\1\u0715",
			"\1\u0716",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0718",
			"",
			"\1\u0719",
			"\1\u071a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u071c",
			"\1\u071d",
			"\1\u071e",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			""
	};

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	protected class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_DISTRIBUTED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_CBO | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_COST | KW_JOINCOST | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA34_192 = input.LA(1);
						s = -1;
						if ( ((LA34_192 >= '\u0000' && LA34_192 <= '\uFFFF')) ) {s = 430;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA34_195 = input.LA(1);
						s = -1;
						if ( ((LA34_195 >= '\u0000' && LA34_195 <= '\uFFFF')) ) {s = 432;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA34_191 = input.LA(1);
						s = -1;
						if ( (LA34_191=='\'') ) {s = 193;}
						else if ( ((LA34_191 >= '\u0000' && LA34_191 <= '&')||(LA34_191 >= '(' && LA34_191 <= '[')||(LA34_191 >= ']' && LA34_191 <= '\uFFFF')) ) {s = 191;}
						else if ( (LA34_191=='\\') ) {s = 192;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA34_430 = input.LA(1);
						s = -1;
						if ( (LA34_430=='\'') ) {s = 193;}
						else if ( ((LA34_430 >= '\u0000' && LA34_430 <= '&')||(LA34_430 >= '(' && LA34_430 <= '[')||(LA34_430 >= ']' && LA34_430 <= '\uFFFF')) ) {s = 191;}
						else if ( (LA34_430=='\\') ) {s = 192;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA34_194 = input.LA(1);
						s = -1;
						if ( (LA34_194=='\"') ) {s = 196;}
						else if ( ((LA34_194 >= '\u0000' && LA34_194 <= '!')||(LA34_194 >= '#' && LA34_194 <= '[')||(LA34_194 >= ']' && LA34_194 <= '\uFFFF')) ) {s = 194;}
						else if ( (LA34_194=='\\') ) {s = 195;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA34_432 = input.LA(1);
						s = -1;
						if ( (LA34_432=='\"') ) {s = 196;}
						else if ( ((LA34_432 >= '\u0000' && LA34_432 <= '!')||(LA34_432 >= '#' && LA34_432 <= '[')||(LA34_432 >= ']' && LA34_432 <= '\uFFFF')) ) {s = 194;}
						else if ( (LA34_432=='\\') ) {s = 195;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA34_51 = input.LA(1);
						s = -1;
						if ( ((LA34_51 >= '\u0000' && LA34_51 <= '&')||(LA34_51 >= '(' && LA34_51 <= '[')||(LA34_51 >= ']' && LA34_51 <= '\uFFFF')) ) {s = 191;}
						else if ( (LA34_51=='\\') ) {s = 192;}
						else if ( (LA34_51=='\'') ) {s = 193;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA34_52 = input.LA(1);
						s = -1;
						if ( ((LA34_52 >= '\u0000' && LA34_52 <= '!')||(LA34_52 >= '#' && LA34_52 <= '[')||(LA34_52 >= ']' && LA34_52 <= '\uFFFF')) ) {s = 194;}
						else if ( (LA34_52=='\\') ) {s = 195;}
						else if ( (LA34_52=='\"') ) {s = 196;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 34, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
