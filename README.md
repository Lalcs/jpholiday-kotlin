# JPHoliday for Kotlin

日本の祝日を取得するライブラリ

## Installation

```bash
```

## Sample Code

### 指定日の祝日名を取得

```kotlin
import kotlinx.datetime.LocalDate
import kotlin.test.assertEquals
import com.lalcs.jpholiday.JPHoliday

val jpHoliday = JPHoliday()

assertEquals(
    jpHoliday.resolveHoliday(LocalDate(2017, 1, 1)),
    listOf(
        Holiday(
            name = "元日",
            date = LocalDate(2017, 1, 1)
        )
    )
)

assertEquals(
    jpHoliday.resolveHoliday(LocalDate(2017, 1, 1)),
    listOf(
        Holiday(
            name = "元日 振替休日",
            date = LocalDate(2017, 1, 1)
        )
    )
)

assertEquals(
    jpHoliday.resolveHoliday(LocalDate(2017, 1, 2)),
    listOf()
)
```

### 指定日が祝日か判定

```kotlin
```

### 指定年の祝日を取得

```kotlin
```

### 指定月の祝日を取得

```kotlin
```

### 指定範囲の祝日を取得

```kotlin
```

### 独自の休日を追加

```kotlin
```

### 独自の休日を削除

```kotlin
```
