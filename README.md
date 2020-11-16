# MongoDb_Test

# mongo.txt 用来向mongodb中插入数据

# 本项目在于简单实现文章的评论功能的demo https://www.toutiao.com/a6721476546088927748/

# 主要简单实现以下功能：
1. 基本增删改查API
2. 根据文章id查询评论
3. 评论点赞

# mongodb的表结构介绍
数据库 garden
|专栏文章评论|comment|||
|--|--|--|--|
|字段名称| 字段含义 | 字段类型 | 备注 |
|id|ID|ObjectId或String|Mongo的主键的字段|
|articleid| 文章ID| String ||
|content |评论内容| String ||
|userid |评论人ID| String ||
|nickname| 评论人昵称| String ||
|createdatetime| 评论的日期时间| Date ||
|likenum |点赞数| Int32 ||
|replynum| 回复数 |Int32 ||
|state |状态 |String| 0：不可见；1：可见；|
|parentid |上级ID| String| 如果为0表示文章的顶级评论|
