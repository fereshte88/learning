

# Welcome

# *Rad Learning Github Contents:*

 - [ ] [Business](#-business)
 - [ ] [Project](#-project)
 - [ ] [Architecture](#-architecture)
 - [ ] [Design](#-design)
 - [ ] [Development](#-development)
 - [ ] [Software Configuration Management (SCM)](#-software-configuration-management-scm)
 - [ ] [Build Automation](#-build-automation)
 - [ ] [ORM and Databases](#-orm-and-databases)
 - [ ] [NoSql Databases](#-nosql-databases)
 - [ ] [Security](#-security)
 - [ ] [Caching](#-caching)
 - [ ] [Indexing](#-indexing)
 - [ ] [API Design Ecosystems](#-api-design-ecosystems)
 - [ ] [Testing](#-testing)
 - [ ] [Code Analysis](#-code-analysis)
 - [ ] [Clouding Services](#-clouding-services)
 - [ ] [Application Servers](#-application-servers)
 - [ ] [DevOps](#-devops)
 - [ ] [Middleware Systems](#-middleware-systems)
 - [ ] [API Management Platform](#-api-management-platforms)
 - [ ] [Reporting](#-reporting)
 - [ ] [Virtualization](#-virtualization)
 - [ ] [Operation Systems](#-operation-systems)
 - [ ] [Techniques](#-techniques)




## [^](#welcome) Business 



+ **Concept**:
  1. Business:
      >Business is the activity of making one's living or making money by producing or buying and selling products (such as goods and services). Simply put, it is "any activity or enterprise entered into for profit.
    2. Business Process and Workflow:
        >Business processes is a sequence of activities (subdivided into tasks) ordered in a logical way, with cause and effect relations between them, and with the objective of delivering a product, service, information, decision or other output to an internal or external customer.
        
        >Workflow is a set of technologies and tools that enable documents, information, activities and tasks to flow appropriately in the company, or department of a company.
    3. Business Process and Workflow Difference:
        >Process is a sequence of tasks, workflow is a way to make this sequence more productive and efficient
        
        >Process is something that exists naturally and flows intuitively. A workflow is analyzed, planned, modeled and automated consciously and with well-defined purposes
        
        >Process is the way a team coordinates and communicates to deliver a result. Workflow is a technology or tool that can help to do achieve this result in the best way.
        
        >Not every process is automated, the goal of workflow software is actually to automate processes
        
        >Workflow is a consequence of the existence of processes, so it’s possible for a process to exist without workflow. Conversely a workflow cannot exist without the corresponding process.
    4. Activity:
        >An activity is a major unit of work to be completed in achieving the objectives of a process. An activity has precise starting and ending dates, incorporates a set of tasks to be completed, consumes resources, and results in work products. An activity may have a precedence relationship with other activities.
    5. Task:
        >A BPMN task is an atomic activity within a process flow. You create a task when the activity cannot be broken down to a finer level of detail.
    6. BPM(Business process modeling):
        >Business process modeling (BPM) in business process management and systems engineering is the activity of representing processes of an enterprise, so that the current process may be analysed, improved, and automated. BPM is typically performed by business analysts, who provide expertise in the modeling discipline.
    7. BPMN:
        >Business Process Model and Notation is a graphical representation for specifying business processes in a business process model. Business Process Management Initiative developed BPMN, which has been maintained by the Object Management Group since the two organizations merged in 2005.
    8. BPMS:
        >BPMS is a software tool used to improve an organization's business processes through the definition, automation, and analysis of business processes.
    9. BPEL:
        >The Web Services Business Process Execution Language, commonly known as BPEL, is an OASIS standard executable language for specifying actions within business processes with web services. Processes in BPEL export and import information by using web service interfaces exclusively.
    10. Earned Value:
        >Earned Value is an approach where you monitor the project plan, actual work, and work completed _value_ to see if a project is on track. Earned Value shows how much of the budget and time should have been spent, considering the amount of work done so far.

+ **Tools**: 
    1. Bizagi Modeler:
        >Bizagi Modeler is a BPMN process modeling software that facilitates the creation and implementation of flowcharts and workflows.
    2. ActiveVOS:
        >ActiveVOS is a service oriented process automation platform. In ActiveVOS, you can quickly create BPMN2.0 compliant process models that seamlessly integrate people, processes and systems, increasing the efficiency and visibility of your business.
    3. Sharepoint:
        >SharePoint is a web-based collaborative platform that integrates with Microsoft Office. Launched in 2001, SharePoint is primarily sold as a document management and storage system, but the product is highly configurable and usage varies substantially among organizations.


## [^](#welcome) Project
+ **Concept**:
    1. PMBOK:
        >PMBOK stands for Project Management Body of Knowledge and it is the entire collection of processes, best practices, terminologies, and guidelines that are accepted as standards within the project management industry.
    2. Project (According to PMBOK):
        >A project is a temporary endeavor undertaken to create a unique product, service, or result. The temporary nature of projects indicates that a project has a definite beginning and end.
    3. Project Phases (According to PMBOK):
        >***Initiating***:  The project is authorized, funded and defined.  This phase occurs on the organizational level (i.e. above the project).  The organization defines a business need the project is meant to satisfy.
        
        >***Planning***:  The project manager develops a project management plan, which defines how the project will be carried out, who will do the work, how long it will take, and so forth.  The project management plan must be approved by the project sponsor to become official, and changes must be re-approved according to the change management processes described therein.
        
        >***Execution***:  The project team gets to work producing the project’s deliverables.
        
        >***Monitoring & Controlling***:  The project manager ensures that the work is carried out according to the plan, and tracks deviations using earned value analysis for schedule and cost, as will as monitoring the scope, communications, vendors, and any other item necessary to ensure the project goes according to plan.
        
        >***Closing***:  The project must be officially closed, final details determined, vendors released, and so forth.
        
    4. Project Knowledge Areas (According to PMBOK):
        >***Project Integration Management***: 
        
        >***Project Scope Management***: 
        
        >***Project Schedule Management***: 
        
        >***Project Cost Management***: 
        
        >***Project Quality Management***: 
        
        >***Project Resource Management***: 
        
        >***Project Communications Management***: 
        
        >***Project Risk Management***: 
        
        >***Project Procurement Management***: 
        
        >***Project Stakeholder Management***: 

    5. WBS (According to PMBOK):
        >Work breakdown structure is a deliverable oriented hierarchical decomposition of the work that can be executed by the project team.
    6. ERP:
        >ERP is usually referred to as a category of business management software — typically a suite of integrated applications—that an organization can use to collect, store, manage, and interpret data from these many business activities.
        
+ **Tools**: 
    1. Primavera:
        >Primavera is an enterprise project portfolio management software. It includes project management, product management, collaboration and control capabilities, and integrates with other enterprise software such as Oracle and SAP’s ERP systems. Primavera was launched in 1983 by Primavera Systems Inc., which was acquired by Oracle Corporation in 2008
    2. MS Project:
        >Microsoft Project is a project management software product, developed and sold by Microsoft. It is designed to assist a project manager in developing a schedule, assigning resources to tasks, tracking progress, managing the budget, and analyzing workloads.
    3. SAP ERP:
        >SAP ERP is an enterprise resource planning software developed by the German company SAP SE

## [^](#welcome) Architecture
+ **Concept**:
  1. Software Architecture:
        >a Software Architecture can contain several architectural styles, and each architectural style can make use of several architectural patterns. [https://stackoverflow.com/questions/3958316/whats-the-difference-between-architectural-patterns-and-architectural-styles](https://stackoverflow.com/questions/3958316/whats-the-difference-between-architectural-patterns-and-architectural-styles)
         
  2. Software Architectural Style:
        >An Architectural Style is just a name given to a recurrent architectural design. Contrary to a pattern, it doesn't exist to "solve" a problem. [https://stackoverflow.com/questions/3958316/whats-the-difference-between-architectural-patterns-and-architectural-styles](https://stackoverflow.com/questions/3958316/whats-the-difference-between-architectural-patterns-and-architectural-styles)
         
  3. Software Architectural Pattern:
        >An Architectural Pattern is a way of solving a recurring architectural problem. MVC, for instance, solves the problem of separating the UI from the model. [https://stackoverflow.com/questions/3958316/whats-the-difference-between-architectural-patterns-and-architectural-styles](https://stackoverflow.com/questions/3958316/whats-the-difference-between-architectural-patterns-and-architectural-styles)
         
  4. Layer and Tier:
        >***Layer***: Logical layers are merely a way of organizing your code. Typical layers include Presentation, Business and Data – the same as the traditional 3-tier model. But when we’re talking about layers, we’re only talking about logical organization of code. In no way is it implied that these layers might run on different computers or in different processes on a single computer or even in a single process on a single computer. All we are doing is discussing a way of organizing a code into a set of layers defined by specific function.

        >***Tier***: Physical tiers, are only about where the code runs. Specifically, tiers are places where layers are deployed and where layers run. In other words, tiers are the physical deployment of layers.

+ **Software Architectural Styles:**:
  1. ***Structure Category>*** [Component-based](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Component-based.docx?raw=true)
        >Component-based architecture focuses on the decomposition of the design into individual functional or logical components that represent well-defined communication interfaces containing methods, events, and properties. It provides a higher level of abstraction and divides the problem into sub-problems, each associated with component partitions.
The primary objective of component-based architecture is to ensure component reusability. A component encapsulates functionality and behaviors of a software element into a reusable and self-deployable binary unit. There are many standard component frameworks such as COM/DCOM, JavaBean, EJB, CORBA, .NET, web services, and grid services. These technologies are widely used in local desktop GUI application design such as graphic JavaBean components, MS ActiveX components, and COM components which can be reused by simply drag and drop operation.
معماری مبتنی بر کامپوننت بر تجزیه طراحی به اجزای عملکردی یا منطقی فردی متمرکز است که نمایانگر رابطهای ارتباطی کاملاً تعریف شده و حاوی روشها ، رویدادها و خصوصیات است. سطح بالاتری از انتزاع را فراهم می کند و مسئله را به مشکلات فرعی تقسیم می کند که هر یک با پارتیشن های مؤلفه همراه است.
هدف اصلی معماری مبتنی بر کامپوننت اطمینان از قابلیت استفاده مجدد از اجزاء است. یک کامپوننت عملکرد و رفتارهای یک عنصر نرم افزاری را در یک واحد باینری قابل استفاده مجدد و قابل استقرار قرار می دهد. چارچوب های کامپوننت استاندارد بسیاری مانند COM / DCOM ، JavaBean ، EJB ، CORBA ، .NET ، خدمات وب و خدمات شبکه وجود دارد. این فناوری ها به طور گسترده ای در طراحی برنامه GUI دسک تاپ محلی مانند اجزای گرافیکی JavaBean ، اجزای MS ActiveX و اجزای COM مورد استفاده قرار می گیرند که با استفاده از عملیات کشیدن و رها کردن قابل استفاده مجدد هستند.
 [https://www.tutorialspoint.com/software_architecture_design/component_based_architecture.htm](https://www.tutorialspoint.com/software_architecture_design/component_based_architecture.htm)

  2. ***Structure Category>*** Monolithic application
        >In software engineering, a monolithic application describes a single-tiered software application in which the user interface and data access code are combined into a single program from a single platform. A monolithic application is self-contained, and independent from other computing applications.
 [https://en.wikipedia.org/wiki/Monolithic_application](https://en.wikipedia.org/wiki/Monolithic_application)

  3. ***Structure Category>*** [Layered](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Layered.docx?raw=true)
        >The layered pattern is probably one of the most well-known software architecture patterns. Many developers use it, without really knowing its name. The idea is to split up your code into “layers”, where each layer has a certain responsibility and provides a service to a higher layer. There isn’t a predefined number of layers, but these are the ones you see most often:
         - Presentation or UI layer
         - Application layer
         - Business or domain layer
         - Persistence or data access layer
         - Database layer
الگوی لایه ای احتمالاً یکی از شناخته شده ترین الگوهای معماری نرم افزار است. بسیاری از توسعه دهندگان بدون اینکه واقعاً نام آن را بدانند از آن استفاده می کنند. ایده این است که کدهای خود را به "لایه ها" تقسیم کنید ، جایی که هر لایه مسئولیت خاصی دارد و به لایه بالاتری سرویس ارائه می دهد.
تعداد مشخصی از لایه ها مشخص نشده است ، اما اینها نمونه هایی هستند که اغلب مشاهده می کنید:
•	لایه ارائه یا UI
•	سطح کاربردی
•	لایه تجاری یا دامنه
•	لایه ماندگاری یا دسترسی به داده ها
•	لایه پایگاه داده
 [https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k](https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k)
   
  4. ***Structure Category>*** [Pipes and filters](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Pipes%20and%20filters.docx?raw=true)
        >A very simple, yet powerful architecture, that is also very robust. It consists of any number of components (filters) that transform or filter data, before passing it on via connectors (pipes) to other components. The filters are all working at the same time. The architecture is often used as a simple sequence, but it may also be used for very complex structures.
لوله و فیلتر
یک معماری بسیار ساده اما در عین حال قدرتمند ، همچنین بسیار مقاوم است. قبل از انتقال آن از طریق اتصالات (لوله ها) به سایر اجزاء ، از هر تعداد مؤلفه (فیلتر) که داده ها را تبدیل یا فیلتر می کنند تشکیل شده است. فیلترها همه هم زمان کار می کنند. معماری اغلب به عنوان یک ترتیب ساده مورد استفاده قرار می گیرد ، اما ممکن است برای ساختارهای بسیار پیچیده نیز مورد استفاده قرار گیرد.
   ![enter image description here](http://www.dossier-andreas.net/software_architecture/pipe_and_filter_3.jpg)
[https://www.oreilly.com/library/view/software-architecture-with/9781786468529/ch08s04.html](https://www.oreilly.com/library/view/software-architecture-with/9781786468529/ch08s04.html)
[http://www.dossier-andreas.net/software_architecture/pipe_and_filter.html](http://www.dossier-andreas.net/software_architecture/pipe_and_filter.html)

  5. ***Shared memory Category>*** [Database-centric](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Database-centric.docx?raw=true)
        >A data-centric outlook is a core concept in data-centric architecture, where data is viewed as a critical and perpetual asset used in support of applications to produce deliverables. Within data-centric architecture, the data model precedes the implementation of a given application and remains valid long after the application is gone.
چشم انداز محور داده یک مفهوم اصلی در معماری داده محور است ، جایی که داده ها به عنوان دارایی مهم و همیشگی مورد استفاده قرار می گیرند که در پشتیبانی از برنامه ها برای تولید تحویل مورد استفاده قرار می گیرد. در معماری داده محور ، مدل داده پیش از اجرای یک برنامه معین است و مدت طولانی پس از اتمام برنامه معتبر است.
[https://www.vistaprojects.com/blog/data-centric-architecture/](https://www.vistaprojects.com/blog/data-centric-architecture/)
[https://en.wikipedia.org/wiki/Database-centric_architecture](https://en.wikipedia.org/wiki/Database-centric_architecture)

  6. ***Shared memory Category>*** Blackboard

  7. ***Shared memory Category>*** [Rule-based](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Rule%20Based%20Architecture%20of%20an%20Expert%20System.docx?raw=true)
        >The most common form of architecture used in expert (In artificial intelligence, an expert system is a computer system that emulates the decision-making ability of a human expert)  and other types of knowledge based systems is the production system or it is called rule based systems. This type of system uses knowledge encoded in the form of production rules i.e. if-then rules. The rule has a conditional part on the left hand side and a conclusion or action part on the right hand side.
        معمول ترین شکل معماری مورد استفاده در متخصصان و انواع دیگر سیستم های دانش بنیان ، سیستم تولید است یا به آن سیستم های مبتنی بر قاعده گفته می شود. این نوع سیستم از دانش رمزگذاری شده در قالب قوانین تولید مثل قوانین اگر-سپس استفاده می کند. این قاعده در سمت چپ یک قسمت شرطی دارد و نتیجه گیری یا بخش عمل در سمت راست است. به عنوان مثال اگر: شرط1 و شرط2 و شرط3 برقرار بود سپس فعالیت4 رو انجام بده.
       ![enter image description here](https://www.researchgate.net/profile/Johan_Malmqvist/publication/281527823/figure/fig1/AS:284648144949248@1444876814334/System-architecture-for-a-rule-based-system-Adapted-from-Cloud-Billing-Service-by.png)
        [https://www.brainkart.com/article/Rule-Based-Architecture-of-an-Expert-System_8931/](https://www.brainkart.com/article/Rule-Based-Architecture-of-an-Expert-System_8931/)
       
  8. ***Messaging Category>*** [Event-driven](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Event-driven.docx?raw=true)
        >Event-driven architecture (EDA) is a software architecture paradigm promoting the production, detection, consumption of, and reaction to events. 
An event can be defined as "a significant change in state".[1] For example, when a consumer purchases a car, the car's state changes from "for sale" to "sold". A car dealer's system architecture may treat this state change as an event whose occurrence can be made known to other applications within the architecture. From a formal perspective, what is produced, published, propagated, detected or consumed is a (typically asynchronous) message called the event notification, and not the event itself, which is the state change that triggered the message emission. Events do not travel, they just occur. However, the term event is often used metonymically to denote the notification message itself, which may lead to some confusion. This is due to Event-Driven architectures often being designed atop message-driven architectures, where such communication pattern requires one of the inputs to be text-only, the message, to differentiate how each communication should be handled. 
(EDA) یک الگوی معماری نرم افزاری است که باعث تولید ، کشف ، مصرف و واکنش به حوادث می شود.
یک رویداد را می توان به عنوان "تغییر مهمی در وضعیت" تعریف کرد. [1] به عنوان مثال ، هنگامی که یک مشتری یک اتومبیل خریداری می کند ، وضعیت خودرو از "برای فروش" به "فروخته شده" تغییر می کند. معماری سیستم فروشندگی ماشین ممکن است این تغییر حالت را به عنوان رویدادی که وقوع آنرا می توان در سایر برنامه های داخل معماری مشخص کرد ، درمان کند. از دیدگاه رسمی ، آنچه تولید می شود ، منتشر می شود ، تبلیغ می شود ، شناسایی می شود یا مصرف می شود ، پیام (معمولاً ناهمزمان) به نام اطلاع رسانی رویداد است و نه خود رویداد ، آن تغییر حالت است که باعث انتشار پیام می شود. رویدادها سفر نمی کنند ، فقط اتفاق می افتند. با این حال ، اصطلاح رویداد اغلب به صورت مترادفانه برای بیان پیام پیام اعلان استفاده می شود ، که ممکن است منجر به سردرگمی شود. این امر به دلیل معماری رویدادهای محور است که اغلب در بالای معماریهای پیام محور طراحی می شوند ، که در آن الگوی ارتباطی برای تمایز چگونگی انجام هرگونه ارتباط ، نیاز به یکی از ورودی ها به صورت متن است. - [https://codeburst.io/software-architecture-the-difference-between-architecture-and-design-7936abdd5830](https://codeburst.io/software-architecture-the-difference-between-architecture-and-design-7936abdd5830)
         
  9. ***Messaging Category>*** Publish-subscribe
        >In software architecture, publish–subscribe is a messaging pattern where senders of messages, called publishers, do not program the messages to be sent directly to specific receivers, called subscribers, but instead categorize published messages into classes without knowledge of which subscribers, if any, there may be. Similarly, subscribers express interest in one or more classes and only receive messages that are of interest, without knowledge of which publishers, if any, there are.[https://en.wikipedia.org/wiki/Publish%E2%80%93subscribe_pattern](https://en.wikipedia.org/wiki/Publish%E2%80%93subscribe_pattern)
        
  10. ***Messaging Category>*** [Asynchronous messaging](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Asynchronous%20messaging.docx?raw=true)
        >Messaging has been the fundamental communication mechanism which has been succeeded all over the world. Either it is human to human, machine to human or machine to machine, messaging has been the single common method of communication. There are 2 fundamental mechanisms we used to exchange messages between 2(or more) parties.   1.	Synchronous messaging   2.	Asynchronous messaging
        پيام رساني سازوکار اساسي ارتباطاتي است که در سرتاسر جهان موفق شده است. چه از نظر انسان به انسان و چه از نظر دستگاه به انسان و یا از دستگاه به دستگاه دیگر ، پیام رسانی یک روش متداول ارتباطی است. 2 مکانیسم اساسی وجود دارد که ما برای تبادل پیام بین 2 (یا بیشتر) طرف استفاده کردیم.1. پیام رسانی همزمان 2. پیام رسانی ناهمزمان
        https://dzone.com/articles/comparison-of-asynchronous-messaging-technologies
        
  11. ***Adaptive systems Category>*** [Plug-ins](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Plug-ins.docx?raw=true)
        >In computing, a plug-in (or plugin, add-in, addin, add-on, or addon) is a software component that adds a specific feature to an existing computer program. When a program supports plug-ins, it enables customization. 
Web browsers have historically allowed executables as plug-ins, though they are now mostly deprecated, which are a different type of software module than browser extensions. Two plug-in examples are the Adobe Flash Player for playing Adobe Flash content and a Java virtual machine for running applets. 
در محاسبات ، افزونه (یا افزونه ، افزونه ، افزودنی ، افزونه یا افزونه) یک جزء نرم افزاری است که یک ویژگی خاص را به یک برنامه رایانه ای موجود اضافه می کند. هنگامی که یک برنامه از افزونه ها پشتیبانی می کند ، سفارشی سازی را فعال می کند.
مرورگرهای وب از لحاظ تاریخی اجرایی را به عنوان افزونه مجاز کرده اند ، اگرچه اکنون اکثرا مستهلک می شوند که نوع دیگری از ماژول نرم افزاری نسبت به پسوندهای مرورگر هستند. دو نمونه از افزونه ها Adobe Flash Player برای پخش محتوای Adobe Flash و یک ماشین مجازی جاوا برای اجرای اپلت ها است.
[https://en.wikipedia.org/wiki/Plug-in_(computing)](https://en.wikipedia.org/wiki/Plug-in_(computing))
        
  12. ***Adaptive systems Category>*** [Microkernel](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/azish/Microkernel.docx?raw=true)
        >The microkernel pattern, or plug-in pattern, is useful when your application has a core set of responsibilities and a collection of interchangeable parts on the side. The microkernel will provide the entry point and the general flow of the application, without really knowing what the different plug-ins are doing.
        الگوی میکروکرونل یا الگوی افزونه در مواردی مفید است که برنامه شما دارای یک مجموعه اصلی از مسئولیت ها و مجموعه ای از قسمت های قابل تعویض در کنار باشد. میکروکرونل بدون درستی از دانستن اینکه چه افزونه های مختلفی انجام می دهند ، نقطه ورود و جریان کلی برنامه را ارائه می دهد.
         ![enter image description here](https://blog.ndepend.com/wp-content/uploads/layered-2.png)
         [https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k](https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k)
         
  13. ***Adaptive systems Category>*** [Reflection](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Reflection%20Architecture.docx?raw=true)
        >In computer science, reflection is the ability of a process to examine, introspect, and modify its own structure and behavior.
Reflection can be used for observing and modifying program execution at runtime. A reflection-oriented program component can monitor the execution of an enclosure of code and can modify itself according to a desired goal related to that enclosure. This is typically accomplished by dynamically assigning program code at runtime.
در علم رایانه ، بازتاب توانایی یک فرایند برای بررسی ، درونگرا و اصلاح ساختار و رفتار خود است
بازتاب می تواند برای مشاهده و اصلاح اجرای برنامه در زمان اجرا استفاده شود. یک مؤلفه برنامه بازتاب محور می تواند بر اجرای یک محفظه کد نظارت کند و می تواند خود را مطابق هدف مورد نظر مربوط به آن محوطه تغییر دهد. این معمولاً با اختصاص پویا کد برنامه در زمان اجرا انجام می شود
  [https://en.wikipedia.org/wiki/Reflection_(computer_programming)](https://en.wikipedia.org/wiki/Reflection_(computer_programming))  
      
  14. ***Adaptive systems Category>*** [Domain specific languages](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Domain%20specific%20languages.docx?raw=true)
        >Building a software product requires knowledge in both software engineering and the domain the software is written for. However, common software engineering methods in fact exclude domain experts from the architectural design of a software system, because the generality of the notations defined by these methods require expert knowledge in the field of software engineering and especially software architecture.  In order to avoid this effect, domain-specific languages (DSL) have been proposed as an alternative to the general purpose languages being normally used in software architecture. One of the advantages of DSLs is that they are less cryptic and easier to learn for domain experts.  Of course the design of such a language requires deep understanding of the problem domain, on the other hand the existing tools for language design are only mastered by a few experts. In order to make DSL design applicable by a broader range of people - especially domain experts - we use Montages, a semi-visual meta language based on the Abstract State Machines approach. A DSL can be specified in Montages by means of visual descriptions of the language constructs. These descriptions can be fed to a rapid prototyping tool, called GemMex, which automatically generates a visual programming environment for the specified DSL. 
ساختن یک محصول نرم افزاری نیاز به دانش در مهندسی نرم افزار و دامنه ای دارد که نرم افزار برای آن نوشته شده است. با این حال ، روشهای معمول مهندسی نرم افزار در حقیقت متخصصان دامنه را از طراحی معماری یک سیستم نرم افزاری محروم می کنند ، زیرا کلیات نمادهای تعریف شده توسط این روش ها نیاز به دانش تخصصی در زمینه مهندسی نرم افزار و به خصوص معماری نرم افزار دارد. به منظور جلوگیری از این تأثیر ، زبانهای اختصاصی دامنه (DSL) به عنوان جایگزینی برای زبانهای هدف کلی که معمولاً در معماری نرم افزار استفاده می شوند ، پیشنهاد شده اند. یکی از مزایای DSL ها این است که آنها رمزنگاری کمتری دارند و یادگیری آنها برای کارشناسان حوزه آسانتر است. البته طراحی چنین زبانی مستلزم درک عمیق از حوزه مسئله است ، از طرف دیگر ابزارهای موجود برای طراحی زبان فقط توسط تعدادی متخصص انجام می شود. برای اینکه طرح DSL توسط طیف وسیعی از مردم - بخصوص کارشناسان حوزه - قابل استفاده باشد ، از Montages ، یک زبان متا نیمه بصری مبتنی بر رویکرد دستگاه های حالت دولت انتزاعی استفاده می کنیم. DSL را می توان با استفاده از توضیحات بصری ساختارهای زبان در مونتاژها مشخص کرد. این توضیحات را می توان به یک ابزار نمونه سازی سریع با نام GemMex که به طور خودکار یک محیط برنامه نویسی بصری برای DSL مشخص ایجاد می کند ، تغذیه کرد.
[https://pdfs.semanticscholar.org/c8fd/df5dd7cf7ffc46cf003b90d1b9404934d1f2.pdf](https://pdfs.semanticscholar.org/c8fd/df5dd7cf7ffc46cf003b90d1b9404934d1f2.pdf)

  15. ***Distributed systems Category>*** [Client-server(2-tier, 3-tier, n-tier exhibit this style)](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/azish/Client-server(2-tier,%203-tier,%20n-tier%20exhibit%20this%20style).docx?raw=true)
        >•	1-Tier: all above layers can only run in one computer. In order to achieve 1-Tier, we need to use the embedded database system, which cannot run in an individual process. Otherwise, there will be at least 2-Tier because non-embedded databases usually can run in an individual computer (tier).  
•	2-Tier: either presentation layer and application layer can only run in one computer, or application layer and data layer can only run in one computer. The whole application cannot run in more than 2 computers. 
•	3-Tier: the simplest case of N-Tier architecture; all above three layers are able to run in three separate computers. Practically, these three layers can also be deployed in one computer (3-Tier architecture, but deployed as 1-Tier). 
•	N-Tier: 3 or more tiers architecture. Diagram 2 below depicts a typical N-Tier architecture. Some layers in 3-Tier can be broken further into more layers. These broken layers may be able to run in more tiers. For example, application layer can be broken into business layer, persistence layer or more. Presentation layer can be broken into client layer and client presenter layer. In diagram 2, in order to claim a complete N-Tier architecture, client presenter layer, business layer and data layer should be able to run in three separate computers (tiers). Practically, all these layers can also be deployed in one compute (tier).  
•	یک-Tier:  تمام لایه های فوق فقط می توانند در یک کامپیوتر اجرا شوند. برای دستیابی به یک- tier ، ما باید از سیستم پایگاه داده جاسازی شده استفاده کنیم ، که نمی تواند در یک فرآیند مجزا اجرا شود. در غیر این صورت ، حداقل دو-Tier وجود خواهد داشت زیرا بانکهای اطلاعاتی غیر جاسازی شده معمولاً می توانند در یک رایانه شخصی (tier) اجرا شوند. 
•	دو-Tier: یا لایه ارائه و لایه برنامه فقط در یک رایانه قابل اجرا هستند ، یا لایه برنامه و لایه داده فقط در یک کامپیوتر قابل اجرا هستند. کل برنامه نمی تواند بیش از دو رایانه اجرا شود.
•	سه- Tier: ساده ترین مورد معماری چندین-Tier؛  هر سه لایه فوق در سه رایانه مجزا قابل اجرا هستند. به طور عملی ، این سه لایه همچنین می تواند در یک کامپیوتر مستقر شود (معماری سه-Tier ، اما به صورت یک-Tier مستقر شده است).
•	چندین-Tier: معماری 3 یا چند tier. نمودار 2 معماری معمولی چندین-Tier را نشان می دهد. بعضی از لایه ها در سه tier می توانند به لایه های بیشتری شکسته شوند. این لایه های شکسته ممکن است در tier های بیشتری اجرا شوند. به عنوان مثال ، لایه کاربرد را می توان به لایه تجاری ، لایه ماندگاری یا موارد دیگر تقسیم کرد. لایه ارائه می تواند به لایه مشتری و لایه ارائه دهنده مشتری تقسیم شود. 
         ![enter image description here](https://lh3.googleusercontent.com/j616TOAcf2A8jsbm0CPRa7o87h-WaaFoyBH0qpbTIX7wKtMQKzq8O7EvuwJyvqEc2xkkZN_4VHp9UFgwy4IC8pu_OzFFtJHQ3iXOoXkZ-MEVadQNv-o)
         [https://www.codeproject.com/Articles/430014/N-Tier-Architecture-and-Tips](https://www.codeproject.com/Articles/430014/N-Tier-Architecture-and-Tips)


  16. ***Distributed systems Category>*** [Shared nothing architecture](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Shared%20nothing%20architecture.docx?raw=true)
        >A shared-nothing architecture (SN) is a distributed-computing architecture in which each update request is satisfied by a single node (processor/memory/storage unit). The intent is to eliminate contention among nodes. Nodes do not share (independently access) memory or storage. One alternative architecture is shared everything, in which requests are satisfied by arbitrary combinations of nodes. This may introduce contention, as multiple nodes may seek to update the same data at the same time.
SN eliminates single points of failure, allowing the overall system to continue operating despite failures in individual nodes and allowing individual nodes to upgrade without a system-wide shutdown.
A SN system can scale simply by adding nodes, since no central resource bottlenecks the system. Another term for SN is sharding. A SN system typically partitions its data among many nodes. A refinement is to replicate commonly used but infrequently modified data across many nodes, allowing more requests to be resolved on a single node.
یک معماری بدون اشتراک مشترک (SN) یک معماری محاسبات توزیع شده است که در آن هر درخواست به روزرسانی توسط یک نود واحد (پردازنده / حافظه / واحد ذخیره سازی) ارضا می شود. هدف از بین بردن اختلاف بین نود هاست. نود ها حافظه یا حافظه ای را به اشتراک نمی گذارند. یک معماری جایگزین همه چیز را به اشتراک می گذارد ، که در آن درخواست ها با ترکیبی دلخواه از نود ها برآورده می شوند. این ممکن است مشاجره ای ایجاد کند ، زیرا ممکن است چندین نود به دنبال به روزرسانی داده های مشابه در همان زمان باشند.
SN نقاط نقص را از بین می برد و به سیستم کلی امکان می دهد علی رغم عدم موفقیت در نود های فردی ، به کار خود ادامه دهد و به نود های فردی اجازه می دهد بدون خاموش کردن سیستم گسترده شوند.
یک سیستم SN می تواند با افزودن نود ها به سادگی مقیاس بشود ، زیرا هیچ منبع تنگنایی در سیستم وجود ندارد. اصطلاح دیگر برای SN خرد کردن است. یک سیستم SN معمولاً داده های خود را در بین بسیاری از نود ها تقسیم می کند. پالایش عبارت است از تکثیر داده های متداول اما معمولاً اصلاح شده در بسیاری از نود ها ، و اجازه می دهد درخواست های بیشتری در یک نود واحد حل شود.
         [https://en.wikipedia.org/wiki/Shared-nothing_architecture](https://en.wikipedia.org/wiki/Shared-nothing_architecture)
 
        
  17. ***Distributed systems Category>*** [Space-based architecture](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Space-based%20architecture.docx)
        >The space-based architecture pattern is specifically designed to address and solve scalability and concurrency issues. 
It is also a useful architecture pattern for applications that have variable and unpredictable concurrent user volumes. 
Solving the extreme and variable scalability issue architecturally is often a better approach than trying to scale out a database or retrofit caching technologies into a non-scalable architecture.  
الگوی معماری مبتنی بر فضا به طور خاص برای رفع و حل مسائل مقیاس پذیری و همزمانی طراحی شده است.
همچنین یک الگوی معماری مفید برای برنامه هایی است که دارای حجم همزمان کاربر متغیر و غیرقابل پیش بینی هستند.
حل مسئله مقیاس پذیری شدید و متغیر از نظر معماری ، اغلب رویکردی بهتر از تلاش برای مقیاس بندی یک بانک اطلاعاتی یا فن آوری های ذخیره سازی مقاوم سازی در یک معماری غیر مقیاس پذیر است. 
         ![enter image description here](https://www.oreilly.com/library/view/software-architecture-patterns/9781491971437/assets/sapr_0501.png)
         [https://www.oreilly.com/library/view/software-architecture-patterns/9781491971437/ch05.html](https://www.oreilly.com/library/view/software-architecture-patterns/9781491971437/ch05.html)
        
  18. ***Distributed systems Category>*** [Object request broker](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/azish/Object%20request%20broker.docx?raw=true)
        >In distributed computing, an object request broker (ORB) is a middleware which allows program calls to be made from one computer to another via a computer network, providing location transparency through remote procedure calls. ORBs promote interoperability of distributed object systems, enabling such systems to be built by piecing together objects from different vendors, while different parts communicate with each other via the ORB.
ORBs handle the transformation of in-process data structures to and from the raw byte sequence, which is transmitted over the network. This is called marshalling or serialization. In addition to marshalling data, ORBs often expose many more features, such as distributed transactions, directory services or real-time scheduling. Some ORBs, such as CORBA-compliant systems, use an interface description language to describe the data that is to be transmitted on remote calls.[1][2]
در محاسبات توزیع شده ، یک کارگزار درخواست شی (ORB) واسطه ای است که امکان برقراری تماس های برنامه از یک رایانه به دیگری از طریق شبکه رایانه ای را فراهم می کند و شفاف سازی مکان را از طریق تماس های رویه ای از راه دور فراهم می کند. ORB ها قابلیت همکاری سیستم های اشیاء توزیع شده را ارتقا می بخشند و این امکان را می دهند که با جمع کردن اشیاء از فروشندگان مختلف ، چنین سیستمهایی ساخته شوند ، در حالی که قسمت های مختلف از طریق ORB با یکدیگر ارتباط برقرار می کنند.
ORB ها تبدیل ساختارهای داده داده در فرآیند را به و از توالی بایت خام که از طریق شبکه منتقل می شود ، انجام می دهند. به این حالت مارشال یا سریال سازی گفته می شود. علاوه بر داده های باتلاقی ، ORB ها اغلب ویژگی های بیشتری مانند معاملات توزیع شده ، خدمات دایرکتوری یا برنامه ریزی در زمان واقعی را در معرض دید شما قرار می دهند. برخی از ORB ها ، مانند سیستم های سازگار با CORBA ، از یک زبان توصیف رابط برای توصیف داده هایی که باید در تماس های از راه دور منتقل شوند استفاده می کنند.
         [https://en.wikipedia.org/wiki/Object_request_broker](https://en.wikipedia.org/wiki/Object_request_broker)
         [https://docs.oracle.com/javase/7/docs/api/org/omg/CORBA/ORB.html](https://docs.oracle.com/javase/7/docs/api/org/omg/CORBA/ORB.html)
         [https://en.wikipedia.org/wiki/Common_Object_Request_Broker_Architecture](https://en.wikipedia.org/wiki/Common_Object_Request_Broker_Architecture)
        


  19. ***Distributed systems Category>*** [Peer-to-peer](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Peer%20to%20peer%20architecture%20style.docx?raw=true)
        >In the peer-to-peer style of the C&C viewtype, components directly interact as peers by exchanging services. Peer-to-peer communication is a kind of request/reply interaction without the asymmetry found in the client-server style. That is, any component can, in principle, interact with any other component by requesting its services. Thus, connectors in this style may involve complex bidirectional protocols of interaction, reflecting the two-way communication that may exist between two or more peer-to-peer components.
در سبک همتا به منظره C&C ، اجزای به طور مستقیم با تبادل سرویس ها به عنوان همسالان در تعامل قرار می گیرند. ارتباط همتا به همسالان نوعی تعامل درخواست / پاسخ است بدون عدم تقارن موجود در سبک مشتری-سرور. یعنی هر مؤلفه ای می تواند در اصل با درخواست خدمات خود با هر مؤلفه دیگر ارتباط برقرار کند. بنابراین ، اتصالات در این سبک ممکن است شامل پروتکل های دو طرفه پیچیده تعامل باشند ، ارتباطات دو طرفه را که ممکن است بین دو یا چند مؤلفه همتا به همتا وجود داشته باشد منعکس کنند.
         [https://flylib.com/books/en/2.121.1/peer_to_peer_style.html](https://flylib.com/books/en/2.121.1/peer_to_peer_style.html)

  20. ***Distributed systems Category>*** [Representational state transfer (REST)](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Representational%20state%20transfer%20(REST).docx?raw=true)
        >یکی از راه‌های ارائه خدمات و همکاری میان سیستم‌های کامپیوتری در بستر شبکه سرویس‌های وبREST (Representational state transfer) می‌باشد. در واقع REST یک معماری وب سرویس است که برای انتقال داده‌ها و اطلاعات، معمولا از پروتکل HTTP استفاده می‌نماید. باید گفت که معماری REST (رست) یک اساس و رکن اصلی در ساختار امروزی وب به شمار می‌رود و در ابررسانه‌های توزیع شده کاربرد دارد. این معماری دارای رویکردی جهت ساده‌سازی سرویس‌های پیچیده وب است و هدف آن نیز توسعه مستقل از اجزا با استفاده از واسطه‌ها می‌باشد؛ این نوع از معماری جهت افزایش انعطاف‌پذیری، سادگی کارها، امکان مشاهده و نظارت و قابلیت حمل و اطمینان است. حیرت‌آور به نظر می‌آید که در دنیای وب، مرورگر کاربران از طریق راه‌های پیچیده با سرویس‌دهندگان ارتباط برقرار نماید، بدون آن‌که کاربران هیچگونه اطلاعی نسبت به منابع سرویس‌دهنده داشته باشند. در این ارتباط یکی از محدودیت‌های اصلی آن است که سرویس‌دهنده و سرویس‌گیرنده هر دو باید رسانه مشترکی را بپذیرند و از آن استفاده نمایند، بطور مثال می‌توان به زبان نشانه‌گذاری HTML اشاره نمود.
         ![enter image description here](http://batisapp.ir/wp-content/uploads/2017/03/rest.gif)
         [http://batisapp.ir/?p=853](http://batisapp.ir/?p=853)
         
         
  21. ***Distributed systems Category>*** [Service-oriented Architecture (SOA)](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/azish/Service-oriented%20Architecture%20(SOA).docx?raw=true)
        >Service-Oriented Architecture (SOA) is a style of software design where services are provided to the other components by application components, through a communication protocol over a network. Its principles are independent of vendors and other technologies. In service oriented architecture, a number of services communicate with each other, in one of two ways: through passing data or through two or more services coordinating an activity. This is just one definition of Service-Oriented Architecture. An article on Wikipedia goes into much more detail.
معماری سرویس گرا (SOA) سبکی از طراحی نرم افزار است که در آن سرویس ها از طریق یک پروتکل ارتباطی از طریق شبکه به سایر مؤلفه ها ارائه می شوند. اصول آن مستقل از فروشندگان و سایر فناوری ها است. در معماری سرویس گرا ، تعدادی از خدمات به یکی از دو طریق با یکدیگر ارتباط برقرار می کنند: از طریق انتقال داده یا از طریق دو یا چند سرویس که یک فعالیت را هماهنگ می کنند. این فقط یک تعریف از معماری سرویس گرا است
         [https://medium.com/@SoftwareDevelopmentCommunity/what-is-service-oriented-architecture-fa894d11a7ec](https://medium.com/@SoftwareDevelopmentCommunity/what-is-service-oriented-architecture-fa894d11a7ec)
         [https://en.wikipedia.org/wiki/Service-oriented_architecture](https://en.wikipedia.org/wiki/Service-oriented_architecture)
         
  22. ***Distributed systems Category>*** [Cloud computing](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Cloud%20Computing%20Architecture.docx?raw=true)
        >Abstract - Cloud computing has evolved to emerge the most topical IT paradigm in recent times. Cloud computing is rapidly transforming the IT landscape. On a pay-as-you-use basis, cloud consumers can access resources, applications and infrastructure provided by cloud providers. Such access could be in form of applications already deployed by cloud providers for use by the cloud users. It could be in form of the capability to develop and deploy user applications using services of a cloud provider. Also, massive storage infrastructure is available for database and data supplied by the user. The cloud has several unique architectures and many more are still evolving. The primary ones are the SaaS, PaaS and the IaaS that can be deployed on private, public, community and hybrid clouds. This paper examines present developments in the cloud computing architecture and also presents guidance for additional research. Papers published in journals, conferences, white papers were analysed.  The objective of this present work is to identify, examine and explain the current trends and development in cloud computing architecture. 
چکیده - محاسبات ابری تکامل یافته است تا مهمترین پارادایم فناوری اطلاعات در زمانهای اخیر ظهور کند. رایانش(محاسبات) ابری به سرعت در حال تغییر چشم انداز فناوری اطلاعات است. براساس استفاده شما ، مصرف کنندگان ابر می توانند به منابع ، برنامه ها و زیرساخت های ارائه شده توسط ارائه دهندگان ابری دسترسی پیدا کنند. چنین دسترسی ممکن است به شکلی از برنامه هایی باشد که قبلاً توسط ارائه دهندگان ابر برای استفاده کاربران ابر مستقر شده اند. این می تواند به شکل قابلیت توسعه و استقرار برنامه های کاربر با استفاده از خدمات ارائه دهنده ابری باشد. همچنین ، زیرساخت ذخیره سازی گسترده برای پایگاه داده و داده های تهیه شده توسط کاربر در دسترس است. ابر چندین معماری بی نظیر دارد و بسیاری دیگر هنوز تکامل می یابند. اصلی ترین آنها SaaS ، PaaS و IaaS هستند که می توانند در ابرهای خصوصی ، عمومی ، جامعه و ترکیبی مستقر شوند. در این مقاله به بررسی پیشرفت های موجود در معماری محاسبات ابری می پردازیم.
        [https://www.researchgate.net/publication/327125094_Cloud_Computing_Architecture_A_Critical_Analysis/link/5cc6ed0f299bf120978802bc/download](https://www.researchgate.net/publication/327125094_Cloud_Computing_Architecture_A_Critical_Analysis/link/5cc6ed0f299bf120978802bc/download)
         
  23. [Object-Oriented](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Object%20Oriented%20Architecture.docx?raw=true)
        >Object Oriented Architecture is an important concept for developing the software. It is a design paradigm based on the division of responsibilities for an application or system into individual reusable and self-sufficient objects. The popular approach of object-oriented design is to view a software system as a collection of entities known as objects. Object oriented is based on modeling real-world objects.
معماری شی گرا مفهوم مهمی برای توسعه نرم افزار است. این یک الگوی طراحی مبتنی بر تقسیم مسئولیت های یک برنامه یا سیستم به اشیاء قابل استفاده مجدد و خودکفا است. رویکرد رایج در طراحی شی گرا ، مشاهده یک سیستم نرم افزاری به عنوان مجموعه ای از اشخاص شناخته شده به عنوان اشیاء است. شی گرا مبتنی بر مدل سازی اشیاء در دنیای واقعی است.

         ![enter image description here](https://www.tutorialride.com/images/software-architecture-and-design/object-oriented-concepts.jpeg)
         [https://www.tutorialride.com/software-architecture-and-design/object-oriented-architecture.htm](https://www.tutorialride.com/software-architecture-and-design/object-oriented-architecture.htm)
         

  24. Resource-oriented Architecture (ROA)

  25. [Message Bus](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Message%20Broker%20-%20Message%20Bus.docx?raw=true)
        >Firstly, let’s be clear, the terms Message Broker and Message Bus are used in architectural patterns for messaging systems, also referred to as messaging topologies. Whilst a Message Bus is one such topology, a Message Broker is only one component in an alternative topology known as Hub and Spoke. These topologies describe different ways for integrating apps using messaging.
در مرحله اول ، واضح است ، اصطلاحات کارگذار پیام و اتوبوس پیام در الگوهای معماری برای سیستم های پیام رسانی استفاده می شود ، همچنین به عنوان توپولوژی پیام رسانی خوانده می شوند. در حالی که یک اتوبوس پیام یکی از این توپولوژی هاست ، یک کارگزار پیام تنها یک جزء در یک توپولوژی جایگزین شناخته شده به عنوان Hub and Spoke است. این توپولوژی ها روش های مختلفی را برای ادغام برنامه ها با استفاده از پیام رسانی توصیف می کنند.
![enter image description here](https://neiljbrown.files.wordpress.com/2017/05/message-bus-toplogy.png)
         ![enter image description here](https://neiljbrown.files.wordpress.com/2017/05/message-broker-mediating-collaboration.png)
         [https://neiljbrown.com/2017/05/13/message-broker-or-bus-whats-the-difference/](https://neiljbrown.com/2017/05/13/message-broker-or-bus-whats-the-difference/)
         [https://docs.microsoft.com/en-us/previous-versions/msp-n-p/ff647328(v=pandp.10)?redirectedfrom=MSDN](https://docs.microsoft.com/en-us/previous-versions/msp-n-p/ff647328(v=pandp.10)?redirectedfrom=MSDN)
         [https://docs.microsoft.com/en-us/previous-versions/msp-n-p/ff648849(v=pandp.10)?redirectedfrom=MSDN](https://docs.microsoft.com/en-us/previous-versions/msp-n-p/ff648849(v=pandp.10)?redirectedfrom=MSDN)
        


+ **Software Architectural Patterns:**
  1. Three-tier

  2. Multilayered architecture

  3. [Model-view-controller](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/rad/Model-view-controller.docx?raw=true)
        >The Model-View-Controller (MVC) framework is an architectural pattern that separates an application into three main logical components Model, View, and Controller. Hence the abbreviation MVC. Each architecture component is built to handle specific development aspect of an application. MVC separates the business logic and presentation layer from each other. It was traditionally used for desktop graphical user interfaces (GUIs). Nowadays, MVC architecture has become popular for designing web applications as well as mobile apps. 
چارچوب Model-View-Controller (MVC) یک الگوی معماری است که یک برنامه را به سه مؤلفه اصلی منطقی Model ، View و Controller جدا می کند. از این رو مخفف MVC. هر مؤلفه معماری ساخته شده است تا جنبه توسعه خاص یک برنامه را داشته باشد. MVC منطق تجارت و لایه ارائه را از یکدیگر جدا می کند. به طور سنتی برای رابط های کاربری گرافیکی دسک تاپ (GUI) استفاده می شد. امروزه معماری MVC برای طراحی برنامه های وب و همچنین اپلیکیشن های موبایل محبوبیت پیدا کرده است.
        [https://www.guru99.com/mvc-tutorial.html](https://www.guru99.com/mvc-tutorial.html)
         
  4. Domain Driven Design

  5. Microkernel

  6. Blackboard pattern

  7. [Sensor-controller-actuator](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Sensor-controller-actuator.docx?raw=true)
        >A system architecture is proposed for integrating sensors, controllers, actuators and instrumentation within a common framework. The goal is to provide a flexible and scalable system. Extending the system, by adding additional components such as sensors or actuators, does not increase the overheads and is achieved seamlessly with minimal modification of the core controller program. The architecture is generic, though it has been proposed to implement a prototype system on a small form factor PC to remote control an autonomous vehicle. The architecture will find application in many other spheres such as home, office and factory automation, process and environmental monitoring, surveillance and robotics.
معماری سیستم برای ادغام سنسورها ، کنترلرها ، محرکها و ابزار دقیق در یک چارچوب مشترک پیشنهاد شده است. هدف این است که یک سیستم انعطاف پذیر و مقیاس پذیر ارائه شود. گسترش سیستم ، با اضافه کردن مؤلفه های اضافی مانند سنسورها یا محرک ها ، باعث افزایش سربار نمی شود و با کمترین تغییر در برنامه کنترل هسته یکپارچه حاصل می شود. معماری عمومی است ، اگرچه پیشنهاد شده است برای پیاده سازی یک سیستم نمونه اولیه بر روی رایانه شخصی با فرم کوچک برای کنترل از راه دور یک وسیله نقلیه خودمختار پیشنهاد شود. این معماری در بسیاری از زمینه های دیگر مانند اتوماسیون خانگی ، اداری و کارخانه ای ، نظارت بر فرآیند و محیط زیست ، نظارت و رباتیک کاربردهایی پیدا خواهد کرد.
        [https://pdfs.semanticscholar.org/8613/4435062a6c00509077c4953d328b631719ee.pdf](https://pdfs.semanticscholar.org/8613/4435062a6c00509077c4953d328b631719ee.pdf)
         
  8. Presentation–abstraction–control

  9. Model-View-ViewModel
 
  10. [CQRS](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/CQRS.docx?raw=true)
        >CQRS is an acronym for Command and Query Responsibility Segregation. The central concept of this pattern is that an application has read operations and write operations that must be totally separated. This also means that the model used for write operations (commands) will differ from the read models (queries). Furthermore, the data will be stored in different locations. In a relational database, this means there will be tables for the command model and tables for the read model. Some implementations even store the different models in totally different databases, e.g. SQL Server for the command model and MongoDB for the read model.
CQRS مخففی برای تفکیک فرماندهی و مسئولیت پرس و جو است. مفهوم اصلی این الگوی این است که یک برنامه دارای عملیات خواندن و نوشتن است که باید کاملاً از هم جدا شوند. این همچنین بدان معنی است که مدل مورد استفاده برای عملیات نوشتن (دستورات) با مدلهای خوانده شده (نمایش داده شد) متفاوت خواهد بود. علاوه بر این ، داده ها در مکان های مختلف ذخیره می شوند. در یک پایگاه داده رابطه ای ، این بدان معناست که جدول هایی برای مدل فرمان و جداول برای مدل خواندن وجود خواهد داشت. برخی از پیاده سازیها حتی مدلهای مختلف را در پایگاههای داده کاملاً متفاوت ذخیره می کنند ، به عنوان مثال. SQL Server برای مدل فرمان و MongoDB برای مدل خواندن.       ![enter image description here](https://blog.ndepend.com/wp-content/uploads/layered-3.png)
        ![enter image description here](https://blog.ndepend.com/wp-content/uploads/Layered-4.png)
[https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k](https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k)

  11. [Event Sourcing](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Event%20Sourcing.docx?raw=true)
        >As I mentioned above, CQRS often goes hand in hand with event sourcing. This is a pattern where you don’t store the current state of your model in the database, but rather the events that happened to the model. So when the name of a customer changes, you won’t store the value in a “Name” column. You will store a “NameChanged” event with the new value (and possibly the old one too).
همانطور که میدانید ، CQRS اغلب با کمک event sourcing  اتفاق می افتد. این الگویی است که شما وضعیت فعلی مدل خود را در دیتابیس ذخیره نمی کنید ، بلکه اتفاقاتی است که برای مدل افتاده است. بنابراین وقتی نام مشتری تغییر می کند ، شما ارزش آن را در ستون "نام" ذخیره نمی کنید. شما یک رویداد ""NameChanged را با مقدار جدید (و احتمالاً قدیمی) نیز ذخیره خواهید کرد.
       ![enter image description here](https://blog.ndepend.com/wp-content/uploads/layered-5.png)[https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k](https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k)
        
  12. [Microservice](https://github.com/motaharinia/learning/blob/master/Architecture/resource/sessions/motaharinia/Microservices.docx?raw=true)
        >When you write your application as a set of microservices, you’re actually writing multiple applications that will work together. Each microservice has its own distinct responsibility and teams can develop them independently of other microservices. The only dependency between them is the communication. As microservices communicate with each other, you will have to make sure messages sent between them remain backwards-compatible (Backward compatibility is a property of a system, product, or technology that allows for interoperability with an older legacy system, or with input designed for such a system, especially in telecommunications and computing.). This requires some coordination, especially when different teams are responsible for different microservices. A diagram can explain.
وقتی برنامه خود را به عنوان مجموعه میکروسرویسها می نویسید ، در واقع چندین برنامه می نویسید که با هم کار خواهند کرد. هر میکروسرویس وظیفه متمایز خود را دارد و تیم ها می توانند آنها را بطور مستقل از سایر میکروسرویس ها توسعه دهند. تنها وابستگی بین آنها ارتباط است. از آنجا که میکرو سرویس ها با یکدیگر ارتباط برقرار می کنند ، شما باید مطمئن شوید که پیام های ارسالی بین آنها backwards-compatible (backwards-compatible خاصیت یک سیستم ، محصول یا فناوری است که امکان همکاری با سیستم قدیمی تریا ورودی را برای چنین سیستمی بخصوص در ارتباطات از راه دور و محاسبات فراهم می کند.) باقی می مانند. این امر به برخی از هماهنگی ها نیاز دارد ، به ویژه هنگامی که تیم های مختلف مسئولیت میکروسرویس های مختلف را بر عهده دارند. یک نمودار می تواند توضیح دهد.
![enter image description here](https://blog.ndepend.com/wp-content/uploads/layered-6.png)
[https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k](https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k)

## [^](#welcome) Design
+ **Concept**:
    1. DDD(Domain Driven Design):
        >DDD, is an approach to development that connects the implementation to an evolving model; placing the focus of the project on the core domain (sphere of knowledge), the logic behind it, and forces collaboration between technical and nontechnical parties to improve the model.
    2. TDD(Test Driven Development):
        >TDD, is a process of developing software where a test is written prior to writing code. Once that is done, developers will work towards writing just enough code to pass the test, and then begin refactoring.
    3. BDD(Behavioural Driven Development):
        >Behavioural Driven Development, or BDD, is a refinement of TDD and DDD that aims to streamline development through narrowing communication gaps, creating a better understanding of the customer, and allowing for continuous communication. Simply put, BDD is a way of combining business requirements with code and allows you to understand the behaviour of the system from a business/end-user perspective.
    4. UML: 
        >The Unified Modeling Language (UML) is a general-purpose, developmental, modeling language in the field of software engineering that is intended to provide a standard way to visualize the design of a system.
    6. RUP:
        >Short for Rational Unified Process, a software development methodology from Rational. Based on UML, RUP organizes the development of software into four phases, each consisting of one or more executable iterations of the software at that stage of development

+ **Tools**: 
    1. Visual Paradigm:
        >Visual Paradigm is a UML CASE Tool supporting UML 2, SysML and Business Process Modeling Notation from the Object Management Group. In addition to modeling support, it provides report generation and code engineering capabilities including code generation.
    2. Microsoft Office:
        >Microsoft Office is a suite of desktop productivity applications that is designed specifically to be used for office or business use. It is a proprietary product of Microsoft Corporation and was first released in 1990.


## [^](#welcome) Development
+ **Concept**:
    1. Agile:
        >Agile methodology is a type of project management process, mainly used for software development, where demands and solutions evolve through the collaborative effort of self-organizing and cross-functional teams and their customers.
    2. CI/CD:
        >CI/CD is a solution to the problems integrating new code can cause for development and operations teams (AKA “integration hell”). Specifically, CI/CD introduces ongoing automation and continuous monitoring throughout the life-cycle of apps, from integration and testing phases to delivery and deployment.
    3. Object-oriented programming:
        >Object-oriented programming is a programming paradigm based on the concept of "objects", which can contain data, in the form of fields, and code, in the form of procedures. A feature of objects is an object's procedures that can access and often modify the data fields of the object with which they are associated.
    4. Clean Coding:
        >Even bad code can function. But if code isn't clean, it can bring a development organization to its knees. Every year, countless hours and significant resources are lost because of poorly written code.
    5. Design Patterns:
        >A software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design.
    6. Multithreading:
        >Multithreadingis the ability of a central processing unit to provide multiple threads of execution concurrently, supported by the operating system. This approach differs from multiprocessing.
    7. Web Socket:
        >WebSocket is a computer communications protocol, providing full-duplex communication channels over a single TCP connection. The WebSocket protocol was standardized by the IETF as RFC 6455 in 2011, and the WebSocket API in Web IDL is being standardized by the W3C. WebSocket is distinct from HTTP
    8. Exception:
        >An exception is an abnormal or unprecedented event that occurs after the execution of a software program or application. It is a runtime error of an undesired result or event affecting normal program flow. An exception is also known as a fault.
    9. Interceptor:
        >Interceptors are used to implement cross-cutting concerns, such as logging, auditing, and security, from the business logic. 
    10. JNDI:
        >The Java Naming and Directory Interface (JNDI) is a Java API for a directory service that allows Java software clients to discover and look up data and resources (in the form of Java objects) via a name. Like all Java APIs that interface with host systems, JNDI is independent of the underlying implementation.
    11. Data Structure:
        >A data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data
    12. Web Service:
        >A Web service is a software service used to communicate between two devices on a network. More specifically, a Web service is a software application with a standardized way of providing interoperability between disparate applications. It does so over HTTP using technologies such as XML, SOAP, WSDL, and UDDI.
    13. API:
        >An application programming interface is an interface or communication protocol between a client and a server intended to simplify the building of client-side software.
    14. Dependency Injection / Inversion Of Control:
        >Dependency injection is basically providing the objects that an object needs (its dependencies) instead of having it construct them itself. It's a very useful technique for testing, since it allows dependencies to be mocked or stubbed out.

        >Inversion of control (IoC) is a programming principle. IoC inverts the flow of control as compared to traditional control flow. In IoC, custom-written portions of a computer program receive the flow of control from a generic framework.
    15. Reflection:
        >Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.
    16. Progressive web applications(PWA):
        >Progressive web applications are a type of application software delivered through the web, built using common web technologies including HTML, CSS and JavaScript. They are intended to work on any platform that uses a standards-compliant browser.
+ **Tools**: 
    1. Java 8 to 13 Features:
        >https://en.wikipedia.org/wiki/Java_version_history
    2. JavaEE , J2EE , Jakarta:
        >Java Enterprise Edition, formerly Java 2 Platform, Enterprise Edition, currently rebranded as Jakarta EE, is a set of specifications, extending Java SE 8 with specifications for enterprise features such as distributed computing and web services.
https://en.wikipedia.org/wiki/Java_Platform,_Enterprise_Edition
    3. Spring (Spring / Spring Boot) Framework:
        >Spring Boot is an opinionated instance of a Spring application. Spring Boot is a rapid application development platform. It uses various components of Spring, but has additional niceties like the ability to package your application as a runnable jar, which includes an embedded tomcat (or jetty) server.
    4. Kotlin:
        >Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of its standard library depends on the Java Class Library, but type inference allows its syntax to be more concise
    5. Glue:
        >Glue is a Python library to explore relationships within and between related datasets


## [^](#welcome) Software Configuration Management (SCM)
+ **Concept**:
     1. Version Control:
          >A component of software configuration management, version control, also known as revision control or source control, is the management of changes to documents, computer programs, large web sites, and other collections of information. Changes are usually identified by a number or letter code, termed the "revision number", "revision level", or simply "revision". For example, an initial set of files is "revision 1". When the first change is made, the resulting set is "revision 2", and so on. Each revision is associated with a timestamp and the person making the change. Revisions can be compared, restored, and with some types of files, merged.
     2. Build Number:
          >executable or a library created by compiling source code. Build #465832567 is just the number of times the main developer compiled the program (or library). Sensible developers only release builds with meaningful and tested changes.
     3. Version:
          >A software build. New version is a different build. Version 2.1.5 means it's the second edition with at least 1 major difference from its 2.0.~ predecessors and 5 minor feature updates or bug fixes.
     4. Release (Public Release):
          >A version intended for use by general population. "Public release" usually means it's a version for normal users who are not involved in testing or development of the software.
     5. Stages of Development:
          >***Pre-alpha***: Pre-alpha refers to all activities performed during the software project before formal testing. These activities can include requirements analysis, software design, software development, and unit testing. In typical open source development, there are several types of pre-alpha versions. Milestone versions include specific sets of functions and are released as soon as the feature is complete.

          >***Alpha***: The alpha phase of the release life cycle is the first phase to begin software testing. In this phase, developers generally test the software using white-box techniques. Additional validation is then performed using black-box or gray-box techniques, by another testing team. Moving to black-box testing inside the organization is known as alpha release. Alpha software is software that is not thoroughly tested by the developer before it is released to customers. Alpha software may contain serious errors, and any resulting instability could cause crashes or data loss

          >***Beta***: Software in the beta stage is also known as betaware. Beta phase generally begins when the software is feature complete but likely to contain a number of known or unknown bugs. Software in the beta phase will generally have many more bugs in it than completed software, speed or performance issues, and may still cause crashes or data loss. The focus of beta testing is reducing impacts to users, often incorporating usability testing. The process of delivering a beta version to the users is called beta release and this is typically the first time that the software is available outside of the organization that developed it. Software beta releases can either be public or private, depending on whether they are openly available or only available to a limited audience. Beta version software is often useful for demonstrations and previews within an organization and to prospective customers.

          >***Perpetual Beta***: Some software is kept in so-called perpetual beta, where new features are continually added to the software without establishing a final "stable" release. As the Internet has facilitated rapid and inexpensive distribution of software, companies have begun to take a looser approach to use of the word "beta". In February 2005, ZDNet published an article about the phenomenon of a beta version often staying for years and being used as if it were in production level. It noted that Gmail and Google News, for example, had been in beta for a long time although widely used; Google News did leave beta in January 2006, followed by Google Apps, including Gmail, in July 2009. This technique may allow a developer to delay offering full support and responsibility for remaining issues.
    
          >***Open and Closed Beta***: Developers may release either a closed beta also called private beta, or an open beta also called public beta; closed beta versions are released to a restricted group of individuals for a user test by invitation, while open beta testers are from a larger group, or anyone interested. Private beta could be suitable for the software that is capable to deliver value, but is not ready to be used by everyone either due to scaling issues, lack of documentation or still missing vital features. The testers report any bugs that they find, and sometimes suggest additional features they think should be available in the final version.
       
          >***Release Candidate***: A release candidate (RC), also known as "going silver", is a beta version with potential to be a final product, which is ready to release unless significant bugs emerge. In this stage of product stabilization, all product features have been designed, coded and tested through one or more beta cycles with no known showstopper-class bugs. A release is called code complete when the development team agrees that no entirely new source code will be added to this release. There could still be source code changes to fix defects, changes to documentation and data files, and peripheral code for test cases or utilities.
     6. Release Life Cycle:
          >***Release to Manufacturing (RTM)*** :  The term release to manufacturing (RTM), also known as "going gold", is a term used when a software product is ready to be delivered. This build may be digitally signed, allowing the end user to verify the integrity and authenticity of the software purchase. A copy of the RTM build known as the "gold master" or GM is sent for mass duplication if applicable. RTM precedes general availability (GA) when the product is released to the public.
          
          >***General Availability (GA)*** :  General availability (GA) is the marketing stage at which all necessary commercialization activities have been completed and a software product is available for purchase, depending, however, on language, region, electronic vs. media availability.
          
          >***Release to Web (RTW)*** :  Release to the web (RTW) or web release is a means of software delivery that utilizes the Internet for distribution. No physical media are produced in this type of release mechanism by the manufacturer. Web releases are becoming more common as Internet usage grows.

     7. GIT Concepts:
          >***Branching*** : Branching, in version control and software configuration management, is the duplication of an object under version control (such as a source code file or a directory tree) so that modifications can occur in parallel along multiple branches. The default branch name in Git is 'master' branch 
          
          >***Clone*** : Clone is for fetching repositories you don't have, checkout is for switching between branches in a repository you already have.
          
          >***Fetch and Pull*** :  fetch really only downloads new data from a remote repository - but it doesn't integrate any of this new data into your working files. Fetch is great for getting a fresh view on all the things that happened in a remote repository. Pull not only downloads new data; it also directly integrates it into your current working copy files.
          
          >***Add to stage*** :  To stage a file is simply to prepare it finely for a commit.
          
          >***Commit*** :  The "commit" command is used to save your changes from stage to the local repository.
          
          >***Push*** :  The git push command is used to upload local repository content to a remote repository. Pushing is how you transfer commits from your local repository to a remote repo.
          
          >***Conflict*** : A conflict arises when two separate branches have made edits to the same line in a file, or when a file has been deleted in one branch but edited in the other.
          
          >***Reverse*** :  Revert some existing commits.
          
          >***Merge and Rebase*** :   Merging takes the contents of a source branch and integrates them with a target branch. In this process, only the target branch is changed. The source branch history remains the same. Rebase is another way to integrate changes from one branch to another. Rebase compresses all the changes into a single “patch.” Then it integrates the patch onto the target branch. Unlike merging, rebasing flattens the history because it transfers the completed work from one branch to another. In the process, unwanted history is eliminated.
          
+ **Tools**: 
     1. GIT(Enterprise GitHub): 
        >GIT is a distributed version-control system for tracking changes in source code during software development.
     2. Apache Subversion: 
        >Apache Subversion is a software versioning and revision control system distributed as open source under the Apache License. Software developers use Subversion to maintain current and historical versions of files such as source code, web pages, and documentation.
     3. Team Foundation Version Control: 
        >TFVC is a centralized version control system allowing teams to store any type of artifact within its repository. TFVC supports two different types of workspaces when working with client tools - Server Workspaces and Local Workspaces. Server workspaces allow developers to lock files for check-out and provide notification to other developers that files are being edited. A frequent complaint for this model is that files on the development machine are marked as read-only. It also requires developers to "go offline" when the server can't be contacted. Local workspaces were designed to avoid these problems. In a local workspace scenario files are not read-only and they do not have to be checked out before working on them. As long as the files are on the developer's local machine, it doesn't matter if the server is connected or not. Conflicts are dealt with at check-in time.
    4. Bitbucket:
         >Bitbucket is a web-based version control repository hosting service owned by Atlassian, for source code and development projects that use either Mercurial or Git revision control systems. Bitbucket offers both commercial plans and free accounts.
                
## [^](#welcome) Build Automation
+ **Concept**:
     1. Maven Repository:
         >In Maven terminology, a repository is a directory where all the project jars, library jar, plugins or any other project specific artifacts are stored and can be used by Maven easily.Maven repository are of three types. The following illustration will give an idea regarding these three types.local,central,remote.

         >***Local Repository***: Maven local repository is a folder location on your machine. It gets created when you run any maven command for the first time.

         >***Central Repository***: Maven central repository is repository provided by Maven community. It contains a large number of commonly used libraries. When Maven does not find any dependency in local repository, it starts searching in central repository

         >***Remote Repository***: Sometimes, Maven does not find a mentioned dependency in central repository as well. It then stops the build process and output error message to console. To prevent such situation, Maven provides concept of Remote Repository, which is developer's own custom repository containing required libraries or other project jars.
         
     3. Maven Dependency Management: 
         >Dependency management is a core feature of Maven. Managing dependencies for a single project is easy. Managing dependencies for multi-module projects and applications that consist of hundreds of modules is possible. Maven helps a great deal in defining, creating, and maintaining reproducible builds with well-defined classpaths and library versions.
         
+ **Tools**: 
     1. Apache Maven:
          >Maven is a build automation tool used primarily for Java projects. Maven addresses two aspects of building software: first, it describes how software is built, and second, it describes its dependencies.
     2. Gradle:
          >Gradle is an open-source build-automation system that builds upon the concepts of Apache Ant and Apache Maven and introduces a Groovy-based domain-specific language instead of the XML form used by Apache Maven for declaring the project configuration.


## [^](#welcome) ORM and Databases
+ **Concept**:
     1. JPA:
          >The Java Persistence API (JPA) is a Java specification for accessing, persisting, and managing data between Java objects / classes and a relational database. JPA was defined as part of the EJB 3.0 specification as a replacement for the EJB 2 CMP Entity Beans specification.
     2. ORM:
          >Object-Relational Mapping (ORM) is a technique that lets you query and manipulate data from a database using an object-oriented paradigm
     2. Database Transaction:
          >A transaction symbolizes a unit of work performed within a database management system against a database, and treated in a coherent and reliable way independent of other transactions. A transaction generally represents any change in a database.
     3. Database Session:
          >A session represents the connection between an application and the relational database that stores its persistent objects. TopLink provides several different session objects that all implement the same Session interface.
     4. Transaction Isolation Level:
          >Isolation levels define the degree to which a transaction must be isolated from the data modifications made by any other transaction in the database system.
     5. Transaction Rollback:
          >A rollback is an operation which returns the database to some previous state. Rollbacks are important for database integrity, because they mean that the database can be restored to a clean copy even after erroneous operations are performed. They are crucial for recovering from database server crashes; by rolling back any transaction which was active at the time of the crash, the database is restored to a consistent state
     6. Join Table:
          >In the join table, match fields are foreign keys. These foreign key fields are populated with data as records in the join table are created from either table it joins
     7. Primary Key:
          >A primary key is a special relational database table column (or combination of columns) designated to uniquely identify all table records. A primary key's main features are: It must contain a unique value for each row of data. It cannot contain null values.
     8. Foreign Key:
          >A foreign key is a column or group of columns in a relational database table that provides a link between data in two tables. It acts as a cross-reference between tables because it references the primary key of another table, thereby establishing a link between them.
     9. Unique Field(s):
          >A unique key is a set of one or more than one fields/columns of a table that uniquely identify a record in a database table
     10. Relations:
          >Using foreign keys, or other candidate keys, you can implement three types of relationships between tables:

          >One-to-one: This type of relationship allows only one record on each side of the relationship. The primary key relates to only one record—or none—in another table. For example, in a marriage, each spouse has only one other spouse. This kind of relationship can be implemented in a single table and therefore does not use a foreign key.

          >One-to-many: A one-to-many relationship allows a single record in one table to be related to multiple records in another table. Consider a business with a database that has Customers and Orders tables.A single customer can purchase multiple orders, but a single order could not be linked to multiple customers. Therefore the Orders table would contain a foreign key that matched the primary key of the Customers table, while the Customers table would have no foreign key pointing to the Orders table.


          >Many-to-many: This is a complex relationship in which many records in a table can link to many records in another table. For example, our business probably needs not only Customers and Orders tables, but likely also needs a Products table.Again, the relationship between the Customers and Orders table is one-to-many, but consider the relationship between the Orders and Products table. An order can contain multiple products, and a product could be linked to multiple orders: several customers might submit an order that contains some of the same products. This kind of relationship requires at minimum three tables. 

     11. Lazy Loading / Eager loading:
          >Lazy loading is used to defer initialization of an object until the point at which it is needed. It can contribute to efficiency in the program's operation if properly and appropriately used. The opposite of lazy loading is eager loading. This makes it ideal in use cases where network content is accessed and initialization times are to be kept at a minimum
     12. Entity:
          >Entity is a thing, person, place, unit, object or any item about which the data should be captured and stored in the form of properties, workflow and tables
     13. Proxy Objects:

          
+ **Tools**: 
     1. Mysql JPA Config:
          >MySQL is an open-source relational database management system. Its name is a combination of "My", the name of co-founder Michael Widenius's daughter, and "SQL", the abbreviation for Structured Query Language.
     2. MariaDB JPA Config:
          >MariaDB is a community-developed, commercially supported fork of the MySQL relational database management system, intended to remain free and open-source software under the GNU General Public License.
     3. Oracle JPA Config:
          >Oracle Database is a proprietary multi-model database management system produced and marketed by Oracle Corporation. It is a database commonly used for running online transaction processing, data warehousing and mixed database workloads.


## [^](#welcome) NoSql Databases
+ **Concept**:

+ **Tools**: 
     1. MongoDB:
          >MongoDB is a cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with schema.
 
 
## [^](#welcome) Security
+ **Concept**:
    1. AAA:
        >Authentication, authorization, and accounting (AAA) is a term for a framework for intelligently controlling access to computer resources, enforcing policies, auditing usage, and providing the information necessary to bill for services.
        
        >**Authentication**: Authentication provides a way of identifying a user, typically by having the user enter a valid user name and valid password before access is granted. The process of authentication is based on each user having a unique set of criteria for gaining access. The AAA server compares a user's authentication credentials with other user credentials stored in a database. If the credentials match, the user is granted access to the network. If the credentials are at variance, authentication fails and network access is denied.
        
        >**Authorization**: Following authentication, a user must gain authorization for doing certain tasks. After logging into a system, for instance, the user may try to issue commands. The authorization process determines whether the user has the authority to issue such commands. Simply put, authorization is the process of enforcing policies: determining what types or qualities of activities, resources, or services a user is permitted. Usually, authorization occurs within the context of authentication. Once you have authenticated a user, they may be authorized for different types of access or activity.
        
        >**Accounting**: The final plank in the AAA framework is accounting, which measures the resources a user consumes during access. This can include the amount of system time or the amount of data a user has sent and/or received during a session. Accounting is carried out by logging of session statistics and usage information and is used for authorization control, billing, trend analysis, resource utilization, and capacity planning activities.
        
    2. Authentication by HTTP Session:
        >**HTTP sessions** is an industry standard feature that allows Web servers to maintain user identity and to store user-specific data during multiple request/response interactions between a client application and a Web application. https://documentation.progress.com/output/ua/OpenEdge_latest/pasoe-admin/overview-of-http-sessions.html
        
    3. Authentication by Token:
        >A web authentication technique that lets users enter their username and password once and receive a uniquely-generated encrypted token in exchange. This token is then used to access protected pages or resources instead of the login credentials for a designated period of time.
        
        >**OAuth2**: OAuth2 is, you guessed it, the version 2 of the OAuth protocol (also called framework). This protocol allows third-party applications to grant limited access to an HTTP service, either on behalf of a resource owner or by allowing the third-party application to obtain access on its own behalf.
        
        >**JWT**: JSON Web Token is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed.
    
    4. Captcha:
        >A CAPTCHA is a type of challenge–response test used in computing to determine whether or not the user is human. The term was coined in 2003 by Luis von Ahn, Manuel Blum, Nicholas J. Hopper, and John Langford. The most common type of CAPTCHA was first invented in 1997 by two groups working in parallel.

    5. SQL Injection:
        >SQL injection is a code injection technique, used to attack data-driven applications, in which malicious SQL statements are inserted into an entry field for execution (e.g. to dump the database contents to the attacker).[1] SQL injection must exploit a security vulnerability in an application's software, for example, when user input is either incorrectly filtered for string literal escape characters embedded in SQL statements or user input is not strongly typed and unexpectedly executed. SQL injection is mostly known as an attack vector for websites but can be used to attack any type of SQL database.

    6. Cross-site scripting (XSS):
        >Cross-site scripting (XSS) is a code injection attack that allows an attacker to execute malicious JavaScript in another user's browser. The attacker does not directly target his victim. Instead, he exploits a vulnerability in a website that the victim visits, in order to get the website to deliver the malicious JavaScript for him. To the victim's browser, the malicious JavaScript appears to be a legitimate part of the website, and the website has thus acted as an unintentional accomplice to the attacker. [https://excess-xss.com/](https://excess-xss.com/)
        
        >**Cookie theft**: The attacker can access the victim's cookies associated with the website using `document.cookie`, send them to his own server, and use them to extract sensitive information like session IDs.
        
        >**Keylogging**: The attacker can register a keyboard event listener using `addEventListener` and then send all of the user's keystrokes to his own server, potentially recording sensitive information such as passwords and credit card numbers.

        >**Phishing**: The attacker can insert a fake login form into the page using DOM manipulation, set the form's `action` attribute to target his own server, and then trick the user into submitting sensitive information.
      
        >**Types of XSS**: Persistent XSS(where the malicious string originates from the website's database.) ,Reflected XSS(where the malicious string originates from the victim's request.)DOM-based XSS(where the vulnerability is in the client-side code rather than the server-side code.)
          
    7. Cross-site Request Forgery/One-click Attack/Session Riding (CSRF or XSRF):
        >Cross-site request forgery, also known as one-click attack or session riding and abbreviated as CSRF (sometimes pronounced sea-surf) or XSRF, is a type of malicious exploit of a website where unauthorized commands are transmitted from a user that the web application trusts. There are many ways in which a malicious website can transmit such commands; specially-crafted image tags, hidden forms, and JavaScript XMLHttpRequests, for example, can all work without the user's interaction or even knowledge. Unlike cross-site scripting (XSS), which exploits the trust a user has for a particular site, CSRF exploits the trust that a site has in a user's browser. [https://hydrasky.com/network-security/cross-site-request-forgery-csrf/](https://hydrasky.com/network-security/cross-site-request-forgery-csrf/)
         
+ **Tools**: 
    1. Spring Security + Session
    2. Spring Security + OAuth2 (InMemory/JWT/DataSource):


## [^](#welcome) Caching
+ **Concept**:

+ **Tools**: 
    1. Redis:
        >Redis is an open source (BSD licensed), in-memory data structure store, used as a database, cache and message broker. It supports data structures such as strings, hashes, lists, sets, sorted sets with range queries, bitmaps, hyperloglogs, geospatial indexes with radius queries and streams.


## [^](#welcome) Indexing
+ **Concept**:

+ **Tools**: 
    1. HibernateSearch: 
        >Hibernate Search is an extension to Hibernate ORM that adds powerful capabilities, boosting the power and efficiency of queries. It depends on Apache Lucene and is typically used to implement “full-text search.” This newly updated Refcard breaks down getting started with Hibernate Search and searching your database.
 
 
## [^](#welcome) API Design Ecosystems
+ **Concept**:

+ **Tools**: 
    1. Spring REST docs:
        >When working on the REST API’s it’s very important that we have an accurate and well-structured documentation. This documentation is the reference point for anyone who want to use our API. Spring REST Docs produce documentation that is accurate, concise, and well-structured.
    2. Swagger:
        >Swagger takes the manual work out of API documentation, with a range of solutions for generating, visualizing, and maintaining API docs.
    3. GraphQL:
        >GraphQL is an open-source data query and manipulation language for APIs, and a runtime for fulfilling queries with existing data. GraphQL was developed internally by Facebook in 2012 before being publicly released in 2015
    4. Open API:
        >An open API (often referred to as a public API) is a publicly available application programming interface that provides developers with programmatic access to a proprietary software application or web service.
    5. YAML:
        >YAML is a human-readable data-serialization language. It is commonly used for configuration files and in applications where data is being stored or transmitted. YAML targets many of the same communications applications as Extensible Markup Language but has a minimal syntax which intentionally differs from SGML.
    6. RAML:
        >RESTful API Modeling Language is a YAML-based language for describing RESTful APIs. It provides all the information necessary to describe RESTful or practically RESTful APIs. Although designed with RESTful APIs in mind, RAML is capable of describing APIs that do not obey all constraints of REST.


## [^](#welcome) Testing
+ **Concept**:
    1. Assertion:
        >An assertion is a predicate connected to a point in the program, that always should evaluate to true at that point in code execution.
+ **Tools**: 
    1. Junit (TDD):
        >JUnit is a unit testing framework for the Java programming language. JUnit has been important in the development of test-driven development, and is one of a family of unit testing frameworks which is collectively known as xUnit that originated with SUnit.
    2. Mockito (TDD and BDD):
        >Mockito is an open source testing framework for Java released under the MIT License. The framework allows the creation of test double objects in automated unit tests for the purpose of test-driven development or behavior-driven development
    3. WireMock (TDD):
        >WireMock is a simulator for HTTP-based APIs. Some might consider it a service virtualization tool or a mock server.
    4. Cucumber (BDD):
        >A cucumber is a tool based on Behavior Driven Development (BDD) framework which is used to write acceptance tests for the web application
    5. Usability testing (تست کاربرد پذیری):
        >Usability testing is a technique used in user-centered interaction design to evaluate a product by testing it on users. This can be seen as an irreplaceable usability practice, since it gives direct input on how real users use the system.
https://dynomapper.com/blog/19-ux/271-usability-testing-tools


## [^](#welcome) Code Analysis
+ **Concept**:

+ **Tools**: 
     1. SonarQube:
          >SonarQube is an open-source platform developed by SonarSource for continuous inspection of code quality to perform automatic reviews with static analysis of code to detect bugs, code smells, and security vulnerabilities on 20 programming languages
     2. Veracode:
          >Veracode's service is the industry's leading source code security analyzer. Whether you are analyzing applications developed internally or by third parties, Veracode enables you to quickly and cost-effectively scan software for flaws and get actionable source code analysis results.


## [^](#welcome) Clouding Services
+ **Concept**:

+ **Tools**: 
    1. AWS:
        >Amazon Web Services (AWS) is a secure cloud services platform, offering compute power, database storage, content delivery and other functionality to help businesses scale and grow
    2. Amazon Lambda:
        >AWS Lambda is an event-driven, serverless computing platform provided by Amazon as a part of the Amazon Web Services. It is a computing service that runs code in response to events and automatically manages the computing resources required by that code. It was introduced in November 2014.
    3. Amazon Step Functions:
        >AWS Step Functions lets you coordinate multiple AWS services into serverless workflows so you can build and update apps quickly. Using Step Functions, you can design and run workflows that stitch together services such as AWS Lambda and Amazon ECS into feature-rich applications.
    4. Amazon Kinesis:
        >Amazon Kinesis is an Amazon Web Service (AWS) for processing big data in real time. Kinesis is capable of processing hundreds of terabytes per hour from high volumes of streaming data from sources such as operating logs, financial transactions and social media feeds
    5. Amazon S3:
        >Amazon S3 or Amazon Simple Storage Service is a service offered by Amazon Web Services that provides object storage through a web service interface. Amazon S3 uses the same scalable storage infrastructure that Amazon.com uses to run its global e-commerce network
    6. Amazon Aurora:
        >Amazon Aurora is a relational database service developed and offered by Amazon Web Services beginning in October 2014. Aurora is available as part of the Amazon Relational Database Service
    7. Amazon SageMaker:
        >Amazon SageMaker is a cloud machine-learning platform that was launched in November 2017. SageMaker enables developers to create, train, and deploy machine-learning models in the cloud.
    8. Amazon SQS
        >Amazon Simple Queue Service is a distributed message queuing service introduced by Amazon.com in late 2004. It supports programmatic sending of messages via web service applications as a way to communicate over the Internet.
    9. GCP (Google Cloud Platform):
        >Google Cloud Platform, offered by Google, is a suite of cloud computing services that runs on the same infrastructure that Google uses internally for its end-user products, such as Google Search and YouTube.
 

## [^](#welcome) Application Servers
+ **Concept**:
    1. JAR:
        >A JAR is a package file format typically used to aggregate many Java class files and associated metadata and resources into one file for distribution. It is used to store classes of java created by the user in order to help the runnable and inference concepts embedded within the language.
    2. WAR:
        >A WAR file is an archive that contains all the parts of a web application: Java class files for servlets and web services, JSPs, HTML pages, images, and other resources. The WAR file is simply a JAR file (which is itself a fancy ZIP file) with specified directories for the Java code and one designated configuration file: the web.xml file, which tells the application server what to run and how to run it. WAR files always have the extension .war, but they can be created and read with the standard jar tool.
    3. JAR and WAR Difference:
        >A .war file is a Web Application Archive which runs inside an application server while a .jar is Java Application Archive that runs a desktop application on a user's machine. A war file is a special jar file that is used to package a web application to make it easy to deploy it on an application server.
    3. WAR Deployment:
        >When deployed, the name of the WAR becomes, by default, the root path of the web application. for example for "shoppingcart.war" with "index.html" and "WEB-INF/web.xml" and "WEB-INF/classes/com/PurchaseServlet.class" and "WEB-INF/lib/thirdparty.jar" files , the base URL for this web app, if deployed on http://www.oreilly.com, is http://www.oreilly.com/shoppingcart/, and all references to its documents, images, and servlets start with that path. The top level of the WAR file becomes the document root (base directory) for serving files. Our index.html file appears at the base URL we just mentioned. The _WEB-INF_ directory (all caps, hyphenated) is a special directory that contains all deployment information and application code. This directory is protected by the web server, and its contents are not visible to outside users of the application, even if you add _WEB-INF_ to the base URL. Your application classes can load additional files from this area using `getResource()` on the servlet context, however, so it is a safe place to store application resources.  [https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch15s03.html](https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch15s03.html)
         
+ **Tools**: 
    1. Apache Tomcat:
        >Apache Tomcat implements several Java EE specifications including Java Servlet, JavaServer Pages, Java EL, and WebSocket, and provides a "pure Java" HTTP web server environment in which Java code can run.
    2. Apache TomEE:
        >Apache TomEE is the Java Enterprise Edition of Apache Tomcat that combines several Java enterprise projects including Apache OpenEJB, Apache OpenWebBeans, Apache OpenJPA, Apache MyFaces and others.
    3. IBM WAS:
        >WebSphere Application Server is a software product that performs the role of a web application server. More specifically, it is a software framework and middleware that hosts Java-based web applications. It is the flagship product within IBM's WebSphere software suite.

 
## [^](#welcome) DevOps
+ **Concept**:
    1. IaC:
        >Infrastructure as Code (IaC) has become a best practice for DevOps. Enterprise teams with a need for global infrastructure to support DevOps at Scale can build a strong foundation using IaC with Amazon Web Services (AWS). Infrastructure as Code is the provisioning and management of IT infrastructure. This includes servers, networking, load balancing, and security. Using software instead of physical hardware has major benefits.
+ **Tools**: 
     1. Docker:
        >Docker is a tool designed to make it easier to create, deploy, and run applications by using containers. Containers allow a developer to package up an application with all of the parts it needs, such as libraries and other dependencies, and ship it all out as one package.
    2. Kubernetes:
        >Kubernetes is an open-source container-orchestration system for automating application deployment, scaling, and management. It was originally designed by Google, and is now maintained by the Cloud Native Computing Foundation
    3. Ansible:
        >Ansible is an open-source software provisioning, configuration management, and application-deployment tool. It runs on many Unix-like systems, and can configure both Unix-like systems as well as Microsoft Windows. It includes its own declarative language to describe system configuration.
    4. Bamboo:
        >Bamboo is a continuous integration and continuous deployment server developed by Atlassian. Although initially available both as an on-premises and cloud computing service, in May 2016 it was announced that the cloud version would be discontinued by end of January 2017.
    5. Confluence:
        >Confluence is a collaboration software program developed and published by Australian software company Atlassian.
    6. Jira:
        >JIRA is a tool developed by Atlassian which is an Australian Company. The main purpose of Jira is to track bug, track related issue, and it is used for project management. Jira is designed for project management in an agile way and that is the reason for which most of the official documentation is written with this.



## [^](#welcome) Middleware Systems
+ **Concept**:
     1. Message Broker:
        >A message broker is an architectural pattern for message validation, transformation, and routing. It mediates communication among applications, minimizing the mutual awareness that applications should have of each other in order to be able to exchange messages, effectively implementing decoupling.
        
+ **Tools**: 
    1. Apache Kafka:
        >Apache Kafka is an open-source stream-processing software platform developed by LinkedIn and donated to the Apache Software Foundation, written in Scala and Java. The project aims to provide a unified, high-throughput, low-latency platform for handling real-time data feeds
    2. RabbitMQ:
        >RabbitMQ is an open-source message-broker software that originally implemented the Advanced Message Queuing Protocol and has since been extended with a plug-in architecture to support Streaming Text Oriented Messaging Protocol, Message Queuing Telemetry Transport, and other protocols.
    3. Apache Camel:
        >Apache Camel is an open source framework for message-oriented middleware with a rule-based routing and mediation engine that provides a Java object-based implementation of the Enterprise Integration Patterns using an application programming interface to configure routing and mediation rules
    4. Apache ActiveMQ:
        >Apache ActiveMQ is an open source message broker written in Java together with a full Java Message Service client. It provides "Enterprise Features" which in this case means fostering the communication from more than one client or server.


## [^](#welcome) API Management Platform
+ **Concept**:

+ **Tools**: 
     1. BROADCOM
     2. CA Technologies
     3. Layer 7
     4. Apigee
     5. MuleSoft
     6. Amazon API Gateway
     7. TIBCO
     8. WSO2
     9. IBM DataPower


## [^](#welcome) Reporting
+ **Concept**:

+ **Tools**: 
    1. Spotfire:
        >Spotfire is an extremely powerful enterprise-grade analytical platform for deriving valuable business insights. It is a smart, secure, flexible, and scalable tool that provides data visualization, discovery, wrangling, and predictive analytics capabilities.


## [^](#welcome) Virtualization
+ **Concept**:

+ **Tools**: 
    1. VMware Workstation:
        >VMware Workstation is a hosted hypervisor that runs on x64 versions of Windows and Linux operating systems; it enables users to set up virtual machines on a single physical machine, and use them simultaneously along with the actual machine
    2. Virtual Box:
        >Oracle VM VirtualBox is a free and open-source hosted hypervisor for x86 virtualization, developed by Oracle Corporation.


## [^](#welcome) Operation Systems
+ **Concept**:

+ **Tools**: 
     1. Ubuntu:
        >Ubuntu is a free and open-source Linux distribution based on Debian. Ubuntu is officially released in three editions: Desktop, Server, and Core. All the editions can run on the computer alone, or in a virtual machine. Ubuntu is a popular operating system for cloud computing, with support for OpenStack
     2. CentOS:
        >CentOS is a Linux distribution that provides a free, community-supported computing platform functionally compatible with its upstream source, Red Hat Enterprise Linux. In January 2014, CentOS announced the official joining with Red Hat while staying independent from RHEL, under a new CentOS governing board.


## [^](#welcome) Techniques
+ **Concept**:

+ **Tools**: 
    1. SaaS:
        >a method of software delivery and licensing in which software is accessed online via a subscription, rather than bought and installed on individual computers













----------------
## Sample Project
[Sample "Books Information" Project Diagram](https://mermaidjs.github.io/mermaid-live-editor/#/edit/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG5cbiAgICBjbGFzcyAgQXR0YWNoZWRcbiAgICBBdHRhY2hlZDogLUxvbmcgaWRcbiAgICBBdHRhY2hlZDogLUJvb2sgYm9va1xuICAgIEF0dGFjaGVkOiAtU3RyaW5nIHRpdGxlXG4gICAgXG4gICAgY2xhc3MgIFNlbGxSZXBvcnRcbiAgICBTZWxsUmVwb3J0OiAtTG9uZyBpZFxuICAgIFNlbGxSZXBvcnQ6IC1Cb29rIGJvb2tcbiAgICBTZWxsUmVwb3J0OiAtSW50ZWdlciB5ZWFyXG4gICAgU2VsbFJlcG9ydDogLUludGVnZXIgY291bnRcbiAgICBTZWxsUmVwb3J0OiAtQmlnZGVjaW1hbCB0b3RhbFNlbGxQcmljZVxuICAgIFxuICAgIGNsYXNzICBVc2VyXG4gICAgVXNlcjogLUxvbmcgaWRcbiAgICBVc2VyOiAtU3RyaW5nIHVzZXJuYW1lXG4gICAgVXNlcjogLVN0cmluZyBwYXNzd29yZFxuICAgIFVzZXI6IC1TdHJpbmcgbmFtZVxuICAgIFVzZXI6IC1TdHJpbmcgZmFtaWx5XG5cbiAgICBjbGFzcyAgQXV0aG9yXG5cbiAgICBjbGFzcyAgVHJhbnNsYXRvclxuXG4gICAgY2xhc3MgIEJvb2tcbiAgICBCb29rOiAtTG9uZyBpZFxuICAgIEJvb2s6IC1TdHJpbmcgdGl0bGVcbiAgICBCb29rOiAtQmlnZGVjaW1hbCBwcmljZVxuICAgIEJvb2s6IC1BdHRhY2hlZCBhdHRhY2hlZFxuICAgIEJvb2s6IC1MaXN0PFNlbGxSZXBvcnQ-IHNlbGxSZXBvcnRMaXN0XG4gICAgQm9vazogLUF1dGhvciBhdXRob3JcbiAgICBCb29rOiAtVHJhbnNsYXRvciB0cmFuc2xhdG9yXG5cblxuICAgIEJvb2sgXCIxXCIgLi4gXCIwLi4xXCIgQXR0YWNoZWRcbiAgICBCb29rIFwiMVwiIC4uIFwiMC4uKlwiIFNlbGxSZXBvcnRcbiAgICBVc2VyIDx8LS0gQXV0aG9yXG4gICAgVXNlciA8fC0tIFRyYW5zbGF0b3IiLCJtZXJtYWlkIjp7InRoZW1lIjoiZGVmYXVsdCJ9fQ)


## Markdown documents
* https://stackedit.io/app#
* https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet
* https://support.discordapp.com/hc/en-us/articles/210298617-Markdown-Text-101-Chat-Formatting-Bold-Italic-Underline
* https://jbt.github.io/markdown-editor/
* https://mermaidjs.github.io/mermaid-live-editor/
