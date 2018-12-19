# 用户指南4.x
## 前言
### 问题
如今，我们使用通用的应用程序或库来相互通信。例如，我们经常使用HTTP客户端从web服务器检索信息，并通过web服务调用远程过程调用。但是，通用协议或其实现有时不能很好地扩展。这就像我们不能使用通用HTTP服务器来交换大量文件，电子邮件和近实时消息（如，财务信息和多人游戏数据）。所需要的是高度优化的协议实现，专用于特殊目的。例如，您可能希望实现针对基于AJAX的聊天应用程序，媒体流或大文件传输进行优化的HTTP服务器。您甚至可以设计和实施一个完全根据您的需求量身定制的全新协议。另一个不可避免的情况是，您必须处理传统的专有协议，以确保与旧系统的互操作性。在这种情况下，重要的是我们能多快的实现该协议，同时不牺牲最终应用的稳定性和性能。
### 解决方案3
Netty 项目旨在为可维护的高性能、高可扩展性协议服务器和客户端的快速开发提供异步事件驱动的网络编程易用程序框架和工具。
换句话说，Netty是一个NIO客户端服务器框架，可以快速轻松地开发协议服务器和客户端等网络应用程序。它极大的简化了TCP和UDP套接字服务器开发等网络编程。
“快速简单”并不意味着最终的应用程序会受到可维护性或性能问题的影响。Netty经过精心设计，具有丰富的协议实施经验，入FTP、SMTP、HTTP以及各种基于二进制和文本的遗留协议。因此，Netty成功的找到了一种在不妥协的情况下实现易于开发、性能、稳定性和灵活性的方法。

一些用户可能已经找到了声称具有相同优势的其他网络应用程序框架，您可能想问一下是什么让Netty与它们如此不同。答案是它所建立的哲学。从第一开始，Netty旨在为您提供API和实施方面最舒适的体验。这不是有形的东西，但你会发现，当你阅读本指南并与Netty一起玩的时候，这种理念将使你的生活更轻松。

### 入门

