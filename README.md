**ABOUT**

Multimodular Android app with bottom navigation bar display 4 screens namely home,accounts,cards and payments
Architecture used - MVVM with clean architecure
Notable libraries used - 
1. koin for DI
2. NavGraph for navigation between Screens
3. Epoxy for list view


**Concepts learned/implemented as part of this project**
1. multimodule depenedency management
2. communication b/w multimodule implementation
3. dependency injection using koin
4. handling callback from 1 module to main module using koin dependency resolution
5. module navigation handling and nested navigation from 1 module to another modules (any child fragment) using nested nav graph.
6. Showing different types of list views using epoxy recycler view and epoxy view holders
7. managing dependencies using koin custom scopes
8. kotlin stateflow is used to observe vm states in fragment/activity

   UI is not focused and very basic layouts are created as part of implementing above concepts
