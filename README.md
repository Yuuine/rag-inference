# RAG 推理服务

面向外部系统集成的语言模型服务，提供基于用户查询生成相关回答的能力。

## 核心功能

- **推理服务**：基于用户查询生成相关回答
- **灵活配置**：支持自定义模型参数和超时设置

### 环境要求

- Java 17+
- SpringBoot 4.0.1
- [DeepSeek API 服务](https://www.deepseek.com/)

### 配置说明

在 [application.yaml](file://G:\github\rag-inference\src\main\resources\application.yaml) 中配置 DeepSeek 参数：

```yaml
deepseek:
  api-key: 
  base-url: https://api.deepseek.com/v1 
  model: deepseek-chat 
  temperature: 0.7 
  max-tokens: 1024 
  timeout-seconds: 120
```

## 接口文档

完整 API 说明请参阅：[API 文档](docs/api.md)

## 致谢

- 语言模型服务 [DeepSeek](https://www.deepseek.com/)