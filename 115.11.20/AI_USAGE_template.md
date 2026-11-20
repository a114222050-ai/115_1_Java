# 第七週AI使用紀錄

本範本由Codex生成。另存當日日期目錄AI_USAGE.md，刪除虛構範例後填本人紀錄。沒有使用真實AI也交，來源註明教師模擬，並填本人驗證；未完成就寫待補。

姓名／學號：吳庭宇/A114222050
工具及來源：Google Gemini

## 精簡紀錄

| 使用目的與Prompt摘要（註明來源） | 採納／拒絕與理由 | 本人驗證：預期、實際、證據位置 | 最終修改與commit |
|---|---|---|---|
| 【真實AI：Google Gemini】實作 `Rover.java` 的 `TODO 1`（補全 `spendEnergy` 扣能邏輯，並重構 `explore` 與 `scan`） | 採納：使用 `amount <= 0 \|\| amount > energy` 檢查扣能合法性，並改呼叫 `spendEnergy`、`addSamples` 與 `countAction` 統一管理狀態，符合不直接操作 `private` 欄位的封裝原則 | [請填寫驗證結果，例如：執行 Main / HeavyRoverTry 測試 `explore()` 與 `scan()`，能源與樣本扣除及計次皆符合預期，詳見 `LAB_REPORT.md` 測試輸出] | 完成 `Rover.java` 的 `TODO 1` 重構（commit: `[請填寫你的 git commit hash]`） |
| 【真實AI：Google Gemini】排查 `Rover.java` 的 IntelliJ 紅字編譯錯誤（透過錯誤畫面截圖定位遺失的類別結構） | 採納：貼上片段時誤覆蓋了 `public class Rover` 宣告與原有欄位/建構子，依建議補回完整類別架構後編譯錯誤全部消除 | 預期消除 9 個編譯錯誤並恢復正常編譯；實際 IDE 紅字消失，類別可正常執行 | 還原完整 `Rover.java` 類別結構並保留 `TODO 1` 修改（commit: `[請填寫你的 git commit hash]`） |
| 【真實AI：Google Gemini】實作 `HeavyRover.java` 的 `TODO 2` 與 `TODO 3`（新增 `drillCount` 欄位與完成 `drill()` 鑽探方法） | 採納：僅新增子類別專屬的 `drillCount` 欄位並在建構子初始化為 0；`drill()` 先檢查 `isStopped()` 與 `!spendEnergy(DRILL_COST)` 拒絕條件，通過後才更新樣本、總行動次數與鑽探次數 | [請填寫驗證結果，例如：以初始能源 20、樣本 0 執行 `drill()`，預期剩餘能源 12、樣本 3、行動次數 1、鑽探次數 1；實際結果相符，詳見 `LAB_REPORT.md`] | 完成 `HeavyRover.java` 的 `TODO 2` 與 `TODO 3`（commit: `[請填寫你的 git commit hash]`） |

## 反思

- 哪個案例讓我發現「回成功卻沒更新正確狀態」：在理解 `HeavyRover` 繼承設計（以及教師模擬的錯誤案例）時，若在子類別中重複宣告 `energy`、`samples` 或 `actionCount`，`drill()` 修改到的會是子類別遮蔽（shadowing）的欄位，但呼叫繼承自父類別的 `getEnergy()`、`getSamples()` 讀取的卻仍是父類別的 `private` 欄位，導致出現方法回傳「成功」但查詢狀態卻完全沒變的錯誤。透過父類別提供的 `protected` 輔助方法（`spendEnergy`、`addSamples`、`countAction`）才能正確更新父類別狀態。

- 我保留或拒絕AI建議的理由：保留了 AI 針對 `TODO 1～3` 提供的程式碼結構，因為其在 `drill()` 中嚴格遵守了「先檢查 `isStopped()` 與扣能條件，全部通過後才一次更新樣本、行動次數與鑽探次數」的交易一致性原則，避免了能源不足或任務停止時仍誤加樣本或計次的 Bug；同時在排查 `Rover.java` 編譯錯誤時，也確認並補回了原本的類別宣告與其他方法。

- 我仍無法解釋或尚未完成的部分：[請依實際情況填寫，例如：目前已完成所有實作與本地測試並通過驗證，無尚未完成的部分。]

## 反思

- 哪個案例讓我發現「回成功卻沒更新正確狀態」：待填。
- 我保留或拒絕AI建議的理由：待填。
- 我仍無法解釋或尚未完成的部分：待填。
